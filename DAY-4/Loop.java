package day4;

class Loops{
	public static void show() {
		//for loop demo
		for (int i=0;i<10;i++) {
			System.out.println("numbers"+i);
		}
		
		//while loop demo
		int i = 0;
		while(i<9) {
			i++;
			System.out.println("numbers"+i);
		}
		
		// do while loop
		int k=0;				
		do {		
     		k++;
     		System.out.println("numners" + k);
    	} while(k < 9);
	}
}

public class Loop {
	public static void main(String args[]) {
		Loops l = null;
		l.show();
	}
}
