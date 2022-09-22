package agemarse;
import java.util.*;

public class stringpal {

	public static void main(String[] args) {
		String str, rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		str=sc.nextLine();
		int length=str.length();
		for(int i =length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is not palindrome");
		}

	}

}
