package day4;

public class ExceptHand {
	public static void main(String args[]) {
		int n=10;
		int b=0;
		try {
			int x=n/b;
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("not possible because : "+e);
		}
		finally {
			System.out.println("from finally");
		}
	}
}
