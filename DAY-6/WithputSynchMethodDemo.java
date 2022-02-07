package DAY6;

class TableDemo{
	void printTable(int n) {
		for(int i=1 ; i<6;i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(9000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Mythread3 extends Thread{
	TableDemo t;
	Mythread3(TableDemo t){
		this.t=t;
	}
	public void run() {
		System.out.println("Thread3 starts");
		t.printTable(5);//passing the value of mul 5
	}
}

class Mythread4 extends Thread{
	TableDemo t;
	Mythread4(TableDemo t){
		this.t=t;
	}
	public void run() {
		System.out.println("Thread4 starts");
		t.printTable(50);//passing the value of mul 5
	}
}

class Mythread5 extends Thread{
	TableDemo t;
	Mythread5(TableDemo t){
		this.t=t;
	}
	public void run() {
		System.out.println("Thread5 starts");
		t.printTable(100);//passing the value of mul 5
	}
}

public class WithputSynchMethodDemo {
	public static void main(String[] args) {
		TableDemo obj = new TableDemo();
		Mythread3 t1 = new Mythread3(obj);
		Mythread4 t2 = new Mythread4(obj);
		Mythread5 t3 = new Mythread5(obj);
		t1.start();
		t2.start();
		t3.start();
	}
}
