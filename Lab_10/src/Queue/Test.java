package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
	 public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();
	        queue.offer(1);
	        queue.offer(2);
	        queue.offer(3);
	        MyFIFO_App.stutter(queue);
	        System.out.println("a) "+queue);
	        
	        Queue<String> q = new LinkedList<>();
	        q.offer("a");
	        q.offer("b");
	        q.offer("c");
	        MyFIFO_App.mirror(q);
	        System.out.println("b) "+ q);
	 }
}
