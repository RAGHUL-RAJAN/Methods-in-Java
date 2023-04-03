package This;

public class Demo {
	String name = "Raghul";
	int age = 24;
	
	public void display() {
		String name = "Rajan";
		int age = 27;
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
		System.out.println("************");
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}
}
