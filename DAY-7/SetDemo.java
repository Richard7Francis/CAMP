package DAY7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String args[]) {
		Set<String> hs = new LinkedHashSet<String>();
		Set<String> s = new HashSet<String>();
		
		hs.add("apple");
		hs.add("mango");
		hs.add("banana");
		hs.add("nuts");
		hs.add("apple");
		hs.add("apple");
		hs.add("apple");
		hs.add("apple");
		
		Iterator iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
