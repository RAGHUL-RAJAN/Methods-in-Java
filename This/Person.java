package This;

public class Person {
	String name = "Spiders";
	void eat() {
		this.washHands();
		this.serveFood();
		System.out.println("eat Food");
		this.washHands();
	}
	void washHands() {
		System.out.println("wash your hands");
	}
	void serveFood() {
		System.out.println("serve Food");
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
	}

}
