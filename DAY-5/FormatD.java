package DAY5;

public class FormatD {
	public static void main(String args[]) {
		String s1 = "Brutuss";
		System.out.println(String.format("name is %s",s1));
		System.out.println(String.format("age is %f",34.55));
		System.out.println(String.format("net worth is %.4f",365.33));
	}
}
