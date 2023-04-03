package This;

public class Book {
	String name;
	double price;
	String authorname;
	
	Book(String name,double price,String authorname){
		super();
		this.name = name;
		this.price = price;
		this.authorname = authorname;
	}
	@Override
	public String toString() {
		return "Name : "+name+" "+"Price : "+price+" "+"authorname :";
	}
}

