package agemarse;

import java.util.Scanner;

public class posneg {

	public static void main(String[] args) {
		System.out.println("enter 1 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("positive");
		}

	}

}
