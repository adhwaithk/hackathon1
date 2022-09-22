package agemarse;
import java.util.*;


public class palreplace {
	public static boolean ispalindrome(String str)
	{
	if(str.length()==1)
		return false;
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
		rev += str.charAt(i);
	if(str.equals(rev))
		return true;
	else
		return false;
	}

	public static void main(String[] args) {
		System.out.println("enter string: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		String newstr="";
		int pos;
		for(int i=0;i<arr.length;i++) {
			if(ispalindrome(arr[i])) {
				newstr +="";
				for(int j=0;j<arr[i].length();j++)
					newstr +="*";
			}
			else
				newstr +=" "+arr[i];
		}
		System.out.println("new string: "+newstr);
	}
	

}
