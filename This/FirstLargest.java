package This;

import java.util.Iterator;

public class FirstLargest {
	public static void main(String[] args) {
		int[]a = {10,2,3,5,6,12};
		int Lar = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>Lar) {
				Lar = a[i];
			}
		}
		System.out.println(Lar);
	}
}
