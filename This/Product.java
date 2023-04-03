package This;

public class Product {
	int price = 250;
	void printProduct() {
		System.out.println("Product price ="+this.price+" "+"RS");
	}
	public static void main(String[]args) {
		Product p=new Product();
		p.printProduct();
	}
}


