package agemarse;

import java.util.Scanner;

public class large3 {

	public static void main(String[] args) {
		System.out.println("enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b) && (a>c)) {
			System.out.println("largest is "+a);
		}
		else if((b>a)&&(b>c)) {
			System.out.println("largest is "+b);
				
			}
		else {
			System.out.println("largest is "+c);
			
		}
		

	}

}
