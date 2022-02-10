package DAY8;



class TemplateD<T>{
	T t;
	TemplateD(T t){
		this.t=t;
		System.out.println(t);
	}
}

public class TemplateDemo {
	public static void main(String args[]) {
		TemplateD t1 = new TemplateD(12);
		TemplateD t2 = new TemplateD("45");
	}
}