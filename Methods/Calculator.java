package Methods;
import java.util.*;
public class Calculator {
	static Scanner s=new Scanner (System.in);
	static boolean c = true;
	public static void main(String[] args) {
		System.out.println("Enter the value for A");
		int a=s.nextInt();
		System.out.println("Enter the value for B");
		int b=s.nextInt();
		do {
		System.out.println("1.Addition\n2.Multipe\n3.substract\n4.Division");
		int select=s.nextInt();
			switch (select) {
			case 1:System.out.println(Calculator.add(a, b)); 
			break;
			case 2:System.out.println(Calculator.Multiple(a, b));
			break;
			case 3:System.out.println(Calculator.Substract(a, b));
			break;
			case 4:System.out.println(Calculator.Division(a, b)); 
			break;
			}
		
	} while (c);
		
	}
	
	public static int add(int a, int b) {
		int res=a+b;
		return res;
	}
	public static int Multiple(int a, int b) {
		int res=a*b;
		return res;
	}
	public static int Substract(int a, int b) {
		int res=a-b;
		return res;
	}
	public static int Division(int a, int b) {
		int res=a/b;
		return res;
	}

}
