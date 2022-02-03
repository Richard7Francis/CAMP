package day4;

interface Admin{
	public abstract void read();
	public abstract String write(int flag);
	double execute(double flag1,double flag2);
}

interface Admin2{
	public abstract void read();
}

class Richard implements Admin{
	@Override
	public void read() {
		
	}

	@Override
	public String write(int flag) {
		// TODO Auto-generated method stub
		if (flag == 1)
			System.out.println("Access gained");
        else 
			System.out.println("Access denied");
		return null;
	}

	@Override
	public double execute(double flag1, double flag2) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}

class Andrew implements Admin2{

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceAdmin {
	public static void main(String args[]) {
		Admin r = new Richard();
		r.write(4);
	}

}
