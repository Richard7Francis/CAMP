package DAY5;

public class INTERND {
	public static void main(String args[]) {
		String s1 = "Andrew";
		String s2 = new String("Andrew");
		String s3 = s2.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
	}
}
