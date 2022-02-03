package DAY5;

public class IgnoreTheCase {
	public static void main(String args[]) {
		String s1 = "Richard";
		String s2 = "RichARd";
		String s3 = "Andrew";
		String s4 = new String("Richard");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}
