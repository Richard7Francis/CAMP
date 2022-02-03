package DAY5;

public class EqualD {
	public static void main(String args[]) {
		String s1 = "Richard";
		String s2 = "Richard";
		String s3 = "Andrew";
		String s4 = new String("Richard");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
