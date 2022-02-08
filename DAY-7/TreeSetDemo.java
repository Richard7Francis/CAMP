package DAY7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//treeset does not allow null values
public class TreeSetDemo {
	public static void main(String args[]) {
		Set<String> t = new TreeSet<String>();
		
		t.add("apple");
		t.add("mango");
		t.add("nuts");
		t.add("apple");
		t.add("apple");
		t.add("apple");
		t.add("apple");
		t.add("banana");
		
		Iterator iter = t.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
	}
}
