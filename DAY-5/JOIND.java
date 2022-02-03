package DAY5;
import java.util.Scanner;
public class JOIND {
	public static void main(String args[]) {
        System.out.println("Please enter 3 values");              
        Scanner s = new Scanner(System.in);
        String s1= s.next();
        String s2= s.next();
        String s3= s.next();
        System.out.println(String.join("-",s1,s2,s3));
	}
}
