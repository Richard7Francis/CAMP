package day4;

public class MultipleCatch {
	public static void main(String args[]) {
		int array[] = new int[10];
		try {
			array[11]=100;
			System.out.println(array);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caused due to : "+e);
		}
		catch(IndexOutOfBoundsException r) {
			System.out.println("caused by "+r);
		}
		catch(Exception j) {
			System.out.println("because of "+j);
		}
	}
}
