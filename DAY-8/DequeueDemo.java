package DAY8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Richie");
		deque.add("Andy");
		deque.add("Frank");
		for(String str: deque) {
			System.out.println(str);
		}
	}

}
