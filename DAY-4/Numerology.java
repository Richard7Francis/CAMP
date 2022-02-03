package day4;

import java.util.Scanner;

class Numero{
	
	//calculate the sum
	int Sum(int a) {
		int r,n=0;
		while(a!=0) {
			r=a%10;
			a=a/10;
			n=n+r;
		}
		return n;
	}
	
	//Calculate the numerology number
	int numeronum(int g) {
		int x = 0;
		while(g>=10) {
			g=Sum(g);
		}
		return g;
	}
	
	//odd number count
	int odd(int x) {
		int o=0,r;
		while(x!=0) {
			r=x%10;
			x=x/10;
			if(r%2!=0)
				o=o+1;
	     }
		return o;
	}
	
	//even number count
		int even(int x) {
			int e=0,r;
			while(x!=0) {
				r=x%10;
				x=x/10;
				if(r%2==0)
					e=e+1;
		     }
			return e;
		}
		
}

public class Numerology {
	public static void main(String args[]) {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter number : ");
		int s = r.nextInt();
		Numero n = new Numero();
		System.out.println("Sum of digits : "+n.Sum(s));
		System.out.println("Numerology number : "+n.numeronum(s));
		System.out.println("Number of Odd numbers : "+n.odd(s));
		System.out.println("Number of Even numbers : "+n.even(s));
	}
}
