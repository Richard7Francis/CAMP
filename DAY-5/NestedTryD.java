package DAY5;

public class NestedTryD {
	public static void main(String args[]) {
		try {
			try {
				System.out.println("going to divide by 0");
				int b=39/0;
			}catch(ArithmeticException e) {}//closed here
			
			//2nd
			try {
				
			}catch(ArrayIndexOutOfBoundsException e) {}//closed here
			
		}catch(Exception e) {
			System.out.println("Handled all exceptions with try's");
		}//closed here
	}
}
