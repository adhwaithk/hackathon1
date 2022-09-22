package agemarse;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and cols");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][]a=new int[r][c];
		int[][]b=new int[r][c];
		int[][]g=new int[r][c];

		System.out.println("enter the elements of first matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("enter the elements of second matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				b[i][j]=sc.nextInt();
		}   
		    
  
		  
		    
		 
		for(int i=0;i<r;i++){    
		for(int j=0;j<c;j++){    
		g[i][j]=0;      
		for(int k=0;k<r;k++)      
		{      
		g[i][j]+=a[i][k]*b[k][j];      
		}
		System.out.print(g[i][j]+" ");  
		} 
		System.out.println(); 

	}

}
}
