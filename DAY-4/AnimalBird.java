package day4;

class animal{
	void eat() {
		System.out.println("Animal eats");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
}

class birds extends animal{
	
	@Override
	void eat() {
		System.out.println("Bird eats worms");
	}
	
	@Override
	void sleep() {
		System.out.println("Birds take rest");
	}
	
	void fly() {
		System.out.println("Birds can fly");
	}
}

public class HOA4_1 {
	public static void main(String args[]) {
		animal a = new animal();
		a.eat();
		birds b = new birds();
		b.sleep();
		b.fly();
	}
}
