package Queue;

import java.util.Queue;
import java.util.Stack;

public class MyFIFO_App {
	// method stutter that accepts a queue of integers as a parameter and replaces
	// every element of the queue with two copies of that element
	// front [1, 2, 3] back
	// becomes
	// front [1, 1, 2, 2, 3, 3] back
	public static <E> void stutter(Queue<E> input) {
		int size = input.size();
		for (int i = 0; i < size; i++) {
			E e = input.poll();
			input.offer(e);
			input.offer(e);
		}
	}

	// Method mirror that accepts a queue of strings as a parameter and appends the
	// queue's contents to itself in reverse order
	// front [a, b, c] back
	// becomes
	// front [a, b, c, c, b, a] back
	public static <E> void mirror(Queue<E> input) {
		int size = input.size();
		Stack<E> stack = new Stack<E>();
		for (int i = 0; i < size; i++) {
			E e = input.poll();
			stack.push(e);
			input.offer(e);
		}

		while (!stack.isEmpty()) {
			input.offer(stack.pop());
		}

	}

}
