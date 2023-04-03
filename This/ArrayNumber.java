package This;

public class ArrayNumber {
	public static void main(String[] args) {
		int[]a = {1,2,3,4,5};
		int[]b = {6,7,8,9,10};
		int[] res = new int[a.length + b.length];
		for (int i = 0,m=0,n=b.length-1; i < res.length; i++) {
			if (m<a.length) {
				res[i] = a[m++];
			}
			else if(n >=0){
				res[i] = b[n--];
			}
			System.out.println("res["+i+"]"+"-"+res[i]);
		}
	}
}
