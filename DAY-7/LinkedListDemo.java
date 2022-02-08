package DAY7;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Mango");
		ll.add("Banana");
		ll.add("Nuts");
		ll.add("Kiwi");
		ll.add("Orange");
		ll.add("Apple");
		
		for(String Link: ll) {
			System.out.println("list of fruits : "+Link);
		}
		
		ll.addFirst("Papaya");
		ll.addLast("Jackfruit");
		
		System.out.println("After adding : ");
		for(String Link: ll) {
			System.out.println("list of fruits : "+Link);
		}
	}
}
