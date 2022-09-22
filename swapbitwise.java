package agemarse;
import java.util.*;

public class swapbitwise {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a is: "+a+" and b is: "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a is: "+a+" and b is: "+b);
		
		

	}

}
