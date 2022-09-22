package agemarse;

import java.util.Scanner;

public class ttranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and cols");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][]a=new int[r][c];
		System.out.println("enter the elements of first matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		}
		int transpose[][]=new int[3][3];   
	    
	
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		transpose[i][j]=a[j][i];  
		}    
		}  
		System.out.println("Printing Matrix without transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(a[i][j]+" ");    
		}    
		System.out.println();    
		}    
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		System.out.print(transpose[i][j]+" ");    
		}    
		System.out.println();  


	}

}
}
