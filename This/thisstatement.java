package This;

public class thisstatement {
	void Car() {
		System.out.println("********");
		System.out.println(this);
		
	}
	public static void main(String[] args) {
		thisstatement a = new thisstatement();
		
		System.out.println(a);
		a.Car();
		
	}

}
