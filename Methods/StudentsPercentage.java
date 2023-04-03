package Methods;
import java.util.*;
public class StudentsPercentage {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the name of the student 1");
		String name1 =s.next();
		System.out.println("Enter the name of Student 2" );
		String name2 = s.next();
		System.out.println("Enter the mark Percentage of Student 1");
		double mark1=s.nextDouble();
		System.out.println("Enter the mark Percentage of Student 2");
		double mark2 = s.nextDouble();
		//String res = Score(String name1,String name2,double mark1,double mark2);
		System.out.println("The Top Candidates is "+ Score( name1,name2, mark1, mark2));
	}
	public static String Score(String name1,String name2,double mark1,double mark2) {
		if (mark1>mark2) {
			return name1;
		}else
			return name2;
	}

}
