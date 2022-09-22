package agemarse;

import java.util.Scanner;

public class replacesubstr {

	public static void main(String[] args) {
		String str, str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		str=sc.nextLine();
		System.out.println("enter replacing string");
		str1=sc.nextLine();
		System.out.println("enter replaced string");
		str2=sc.nextLine();
		str = str.replaceFirst(str2, str1);
		System.out.println(str);

	}

}
