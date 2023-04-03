package This;

import java.util.Iterator;

public class AddArray {
	public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	int b[] = {6,7,8,9,10};
	int c[] = {11,12,13,14,15};
	int res[] = new int[a.length+b.length];
	for (int i = 0,m=0,n=b.length-1; i < res.length; i++) {
		if (m<a.length) {
			res[i] = a[m++];
		}else if (n>=0) {
			res[i] = b[n--];
		}
	}
	System.out.println("***************");
		for (int j = 0; j < res.length; j++) {
			System.out.println("res["+j+"]"+"-"+res[j]);
		}
		
		int res1[]= new int[res.length+c.length];
		for (int i = 0,m=0,n=c.length-1; i < res1.length; i++) {
			if (m<res.length) {
				res1[i] = res[m++];
			} else if(n>=0) {
				res1[i] = c[n--];
			}
		}
		System.out.println("***************");
		for (int j = 0; j < res1.length; j++) {
			System.out.println("res1["+j+"]"+"-"+res1[j]);
		}
	}
	}

