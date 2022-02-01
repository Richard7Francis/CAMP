package DAY3;

///this is another component
class Engine{
	void start() {
		System.out.println("engine started");
	}
	
	void stop() {
		System.out.println("engine stopped");
	}
}

class Bike{
	
	void speed() {
		System.out.println("bike has speed");
	}
	
	void color() {
		System.out.println("bike has color");
	}
}

///IS-A relationship
class Yamaha extends Bike{
	void speed() {
		System.out.println("bike has speed 300 miles/hr");
	}
	
	void color() {
		System.out.println("Yamaha is red in color");
	}
	
	///user defined
	void Details() {
		///plug in engine component here
		Engine yamahaengine = new Engine();///created object of engine class
		yamahaengine.start();
		yamahaengine.stop();
	}
}


public class HAS_A {
	public static void main(String args[]) {
		Yamaha yamahabike = new Yamaha();
		yamahabike.Details();
	}
}