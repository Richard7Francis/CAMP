package DAY5;

public class Compare {
	public static void main(String args[]) {
		String s1 = "Richard";
		String s2 = "Richard";
		String s3 = "Andrew";
		String s4 = new String("Richard");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
	}
}
