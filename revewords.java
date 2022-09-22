package agemarse;
import java.util.*;


public class revewords {
	public static String reverse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev +=str.charAt(i);
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split("((?=\\.)|(?<=\\.)|(?=\\s)|(?<=\\s))");
		for(int i=0;i<arr.length;i++) {
			System.out.print(reverse(arr[i])+" ");
		}
		

	}

}
