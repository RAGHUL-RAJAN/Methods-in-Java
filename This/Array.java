package This;

import java.util.Scanner;

public class Array {
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Size of an array");
		int [] a = new int[s.nextInt()];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the Element in a ["+ i+"]");
			a[i] = s.nextInt();
		}
		System.out.println("**************");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]"+"-"+a[i]);
		}
		}

}
