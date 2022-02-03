package day4;

class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}

public class CustomizedExcp {
	public static void main(String args[]) {
		try {
		throw new MyException("This is my own Exception");
		}
		catch(MyException e) {
			System.out.println("caught");
		}
	}
}
