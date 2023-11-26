package Stack;

import java.util.Stack;

public class MyLIFO_App {
	// This method reserves the given array
	public static <E> void reserve(E[] array) {
		Stack<E> stack = new Stack<E>();
		for (E e : array) {
			stack.push(e);

		}
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}

	}

	// This method checks the correctness of the given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==> false
	public static boolean isCorrect(String input) {
		Stack<Character> stack = new Stack<>();

		for (char c : input.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	// This method evaluates the value of an expression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char re = expression.charAt(i);
			if (Character.isDigit(re)) {
				// Nếu là số, đọc toàn bộ số và đẩy vào stack operand
				StringBuilder num = new StringBuilder();
				while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
					num.append(expression.charAt(i));
					i++;
				}
				i--;
				operandStack.push(Integer.parseInt(num.toString()));
			} else if (re == '(') {
				// Nếu là dấu mở ngoặc, đẩy vào stack operator
				operatorStack.push(re);
			} else if (re == ')') {
				// Khi gặp dấu đóng ngoặc, thực hiện các phép toán trong ngoặc
				while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
					int result = performOperation(operandStack.pop(), operandStack.pop(), operatorStack.pop());
					operandStack.push(result);
				}
				operatorStack.pop(); // Loại bỏ dấu mở ngoặc từ stack operator
			} else if (re == '+' || re == '-' || re == '*' || re == '/') {
				// Nếu là toán tử, thực hiện các phép toán có ưu tiên cao hơn hoặc bằng
				while (!operatorStack.isEmpty()
						&& ((re == '*' || re == '/') && operatorStack.peek() == '+' || operatorStack.peek() == '-')) {
					int result = performOperation(operandStack.pop(), operandStack.pop(), operatorStack.pop());
					operandStack.push(result);
				}
				operatorStack.push(re);
			}
		}
		while (!operatorStack.isEmpty()) {
			int result = performOperation(operandStack.pop(), operandStack.pop(), operatorStack.pop());
			operandStack.push(result);
		}
		return operandStack.pop();
	}

	private static int performOperation(int operand2, int operand1, char operator) {
		switch (operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			if (operand2 == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			return operand1 / operand2;
		default:
			throw new IllegalArgumentException("Invalid operator: " + operator);
		}
	}
}
