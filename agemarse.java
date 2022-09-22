package agemarse;
import java.util.*;

public class agemarse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age: ");
		int age=sc.nextInt();
		System.out.println("enter sex: ");
		int sex=sc.next().charAt(0);
		System.out.println("Are you married?");
		int married=sc.next().charAt(0);
		if(sex=='f') {
			System.out.println("you will work only in urban areas");
		}
		if(sex=='m') 
		{	
			if((age>=20)&&(age<=40))
			{
				System.out.println("work anywhere");
			}
			else if((age>40)&&(age<=60)) {
				System.out.println("work in urban area");
			}
			else {
				System.out.println("error");
			}

	}

}
}
