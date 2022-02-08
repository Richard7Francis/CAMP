package DAY7;

import java.util.Vector;

/**
 * 
 * 
 *
 */
public class VectorDemo {
	public static void main(String args[]) {
		Vector<String> vec = new Vector<String>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Dear");
		
		System.out.println("Elements are: "+vec);
		System.out.println("Elements are: "+vec.size());
		
	}
}
