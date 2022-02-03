package day4;
import java.io.IOException;
class M{
	void show() throws IOException{
		System.out.println("inside show()");
		throw new IOException("device error");
	}
}

public class ThrowDemo {
	public static void main(String[] args) {
		M s =new M();
		try {
			s.show();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
