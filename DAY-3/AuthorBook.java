package DAY3;

class Author {
   private String name;
   private String email;
   private char gender;
 
   // Constructor
   public Author(String name, String email, char gender) {
      this.name = name;
      this.email = email;
      this.gender = gender;
   }
   
   public String getName() {
      return name;
   }
   
   public char getGender() {
      return gender;
   }
   
   public String getEmail() {
      return email;
   }

   public String toString() {
      return name + " (" + gender + ") at " + email;
   }
}

class Book {
   private String name;
   private Author author;
   private double price;
   private int qty;
    /** Constructs a Book instance with the given author */
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
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
      this.price = price;
   }
   
   public int getQty() {
      return qty;
   }
   
   public void setQty(int qty) {
      this.qty = qty;
   }
    
   public String toString() {
      return "'" + name + "' by " + author;  
      }
}

public class HOA3 {
	public static void main(String[] args) {
		Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
	      System.out.println(ahTeck);
	      Book dummyBook = new Book("Java for dummies", ahTeck, 9.99, 99);
	      System.out.println(dummyBook);
	      dummyBook.setPrice(8.88);
	      dummyBook.setQty(88);
	      System.out.println("name is: " + dummyBook.getName());
	      System.out.println("price is: " + dummyBook.getPrice());
	      System.out.println("qty is: " + dummyBook.getQty());
	      System.out.println("author is: " + dummyBook.getAuthor());
	      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
	      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
	      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
	      Book moreDummyBook = new Book("Java for more dummies",
	            new Author("Peter Lee", "peter@nowhere.com", 'm'),
	            19.99, 8);
	      System.out.println(moreDummyBook);
	   }
}