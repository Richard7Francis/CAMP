package DAY7;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("banana");
		list.add("mango");
		list.add("apple");
		list.add("papaya");
		list.add("jackfruit");
		
		Collections.sort(list);///sorting alphabetically
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		///enhance for loop
		for(String fruits:list) {
			System.out.println("using enchance loop "+fruits);
		}
		
		///sorting the numbers
		
		List<Integer> listno = new ArrayList<Integer>();
		
		listno.add(13);
		listno.add(15);
		listno.add(5);
		listno.add(2);
		
		Collections.sort(listno);
		
		///enhance for loop
		for(Integer nos:listno) {
			System.out.println("using enchance loop "+nos);
		}
	}
}
