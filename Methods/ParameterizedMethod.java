package Methods;

public class ParameterizedMethod {
	public static void main(String[] args) {
		add(10,20);
		System.out.println("The addition done");
	}
	public static void add(int a, int b) {
		int res=a+b;
		System.out.println(res);
		//return res;
	}
}
