package day4;
/*
 * The static can be:

                      Variable (also known as a class variable)
                      Method (also known as a class method)
                      Block
                      Nested class
                  
 * 
 * 
 * */

class Area {
	
	static {
		System.out.println("__________ from static block");
	}
	
	static {
		System.out.println("__________ from static block   2");
	}
	
	// non static variable
	int length = 10;/// global variable
	//static variable
	static int length1 = 7;/// global variable
	
	// non static method
	void showArea(int side) {
		int breadth = 20;// local variable
		int temp = side * breadth;
		System.out.println(temp);
	}

	/// static method
	static void showArea1(int side) {
		int breadth = 20;// local variable
		int temp = side * breadth;
		System.out.println(temp);
	}
}

public class Static {
	public static void main(String args[]) {
		Area side = null;///class variable(static in nature)
		
		side.showArea1(7);;///this method is called without creating an object
	    
		Area a1 = new Area();
		a1.showArea(74);
		
	}
}
