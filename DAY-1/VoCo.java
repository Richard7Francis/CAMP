package Richard;
import java.util.Scanner;
public class VoCo {
	public static void main(String args[]) {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter char: ");
		char ch= reader.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}
}
