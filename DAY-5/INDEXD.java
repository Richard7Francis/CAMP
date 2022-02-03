package DAY5;
import java.util.Scanner;
public class INDEXD {
	public static void main(String args[]) {
		Scanner r =new Scanner(System.in);
		String s= r.nextLine();  
	    char[] ch = new char[20];  
	      try{  
	         s.getChars(6,16, ch, 0);  
	         System.out.println(ch);  
	      }catch(Exception ex){System.out.println(ex);}  
	}
}
