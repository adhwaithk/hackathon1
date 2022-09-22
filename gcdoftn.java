package agemarse;
import java.util.*;

public class gcdoftn {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		System.out.printf("gcd of a and b is "+b);

		
		

	}

}
