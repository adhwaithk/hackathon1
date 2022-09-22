package agemarse;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 int num ,n, originalNumber, r, result = 0;
		 num=sc.nextInt();
		 n=sc.nextInt();

	        originalNumber = num;

	        while (originalNumber != 0)
	        {
	            r = originalNumber % 10;
	            result += Math.pow(r, n);
	            originalNumber /= 10;
	        }

	        if(result == num)
	            System.out.println(num + " is an Armstrong number.");
	        else
	            System.out.println(num + " is not an Armstrong number.");

	}

}
