package DAY3;

class Author{
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return name+"["+gender+"] at "+email;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;
	public Book(String name,Author author,double price,int qty) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public String toString() {
		return "'"+name+"' by "+author;
	}
}

public class HOA3 {
	public static void main(String args[]) {
		Author a = new Author("Richard","richardfrancis2000@gmail.com",'M');
		System.out.println(a);
		Book b = new Book("Dumb Ways to die",a,100.50,3);
		System.out.println(b);
		System.out.println(b.getName()+" costs "+b.getPrice());
		System.out.println(b.getAuthor().getGender());
		System.out.println(a.getEmail());
	}
}