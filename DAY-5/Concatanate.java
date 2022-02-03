package DAY5;

public class Concatanate {
	public static void main(String args[]) {
		String s1 = "Richard";
		String s2 = "Andrew";
		String s3 = new String("Richard");
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s1));
	}
}
