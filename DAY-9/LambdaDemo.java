package DAY9;

@FunctionalInterface
interface Addable {

	int add(int a, int ab);

}

public class LambdaDemo {
	public static void main(String args[]) {
		
		Addable adddemo = (a,b)->(a+b);
		System.out.println(adddemo.add(5,5));
		
		Addable adddemo1 = (a,b)->{
			return(a+b);
		};
		System.out.println(adddemo1.add(7, 8));
	}

}
