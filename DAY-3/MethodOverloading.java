package DAY3;

class Circ{
	void Area(double radius) {
		double result= 3.14 * radius;
		System.out.println(result);
	}
	double Area(double length, double breadth) {
		double result= length * breadth;
		return result;
	}
}

public class MethodOverloading {
	public static void main(String ar[]) {
		Circ c=new Circ();
		c.Area(12.1);
		
		double temp = c.Area(12,45);
		System.out.println(temp);
		
	}
}
