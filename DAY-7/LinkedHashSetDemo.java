package DAY7;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("apple");
		lhs.add("mango");
		lhs.add("banana");
		lhs.add("nuts");
		lhs.add("apple");
		lhs.add("apple");
		lhs.add("apple");
		lhs.add("apple");
		lhs.add("nuts");
		
		lhs.add(null);
		lhs.add(null);
		lhs.add(null);

		Iterator iter = lhs.iterator();

		if (iter != null) {

			while (iter.hasNext()) {

				System.out.println(iter.next());

			}

		}
		
	}

}
