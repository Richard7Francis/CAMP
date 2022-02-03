package day4;

public class ArrayIOB {
	public static void main(String args[]) {
		int array[]=new int[10];
		
				
		try {
			array[11]=100;
			System.out.println(array);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("not possible because : "+e);
		}
		finally {
			System.out.println("from finally");
		}
	}
}
