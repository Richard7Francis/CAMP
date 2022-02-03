package DAY5;

public class SPLITD {
	public static void main(String args[]) {
		String s = "If@i@could@take";
		String[] array = s.split("@");
		for(int i = 0; i<array.length;i++)
			System.out.println(array[i]);
	}

}
