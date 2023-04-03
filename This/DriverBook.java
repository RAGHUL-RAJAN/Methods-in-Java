package This;

public class DriverBook {
	public static void main(String[] args) {
		Book b1 = new Book("Java",2000,"Rahul");
		Book b2 = new Book("SQL",1500,"Rajan");
		System.out.println(b1.price);
		System.out.println(b1.authorname);
		System.out.println(b2.name);

	}
}
