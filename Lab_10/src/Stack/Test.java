package Stack;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Integer[] exampleArray = { 1, 2, 3, 4, 5 };
		MyLIFO_App.reserve(exampleArray);
		System.out.println("a) Mảng sau khi được thêm vào stack: "+Arrays.toString(exampleArray));

		System.out.println("b) Kiểm tra các dấu đóng mở ngoặc: ");
		System.out.println("()(())[]{(())}: " + MyLIFO_App.isCorrect("()(())[]{(())}"));
		System.out.println("){[]}(): " + MyLIFO_App.isCorrect("){[]}()"));
		
		String testExpression = "51+(54*(3+2))";
        int result =MyLIFO_App.evaluateExpression(testExpression);
        System.out.println("c) Result:  i.e. 51+(54*(3+2)) = " + result);
	}
}
