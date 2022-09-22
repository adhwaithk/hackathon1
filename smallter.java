package agemarse;

import java.util.Scanner;

public class smallter {

	public static void main(String[] args) {
		int temp,small;
		System.out.println("enter 3 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		temp=a<b?a:b;
		small=c<temp?c:temp;
		System.out.println("smallest is: "+small);

	}

}
