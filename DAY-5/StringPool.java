package DAY5;

public class StringPool {
	
	/**
	 * Java String Pool Example
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="Cat";
		String s2="Cat";
		String s3= new String("Cat");
		
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1==s3 : "+(s1==s3));
		
		if(s1.equals(s2))
			System.out.println("both are equals");
		else
			System.out.println("both are not equals");
	}

}
