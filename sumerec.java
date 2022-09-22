package agemarse;

import java.util.Scanner;

public class sumerec {

	public static void main(String[] args) {
		int sumRow,sumCol;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and cols");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][]a=new int[r][c];
		int[][]b=new int[r][c];
		int[][]k=new int[r][c];
		System.out.println("enter the elements of first matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		}
		   r = a.length;    
	        c = a[0].length;    
	            
	           
	        for(int i = 0; i < r; i++){    
	            sumRow = 0;    
	            for(int j = 0; j < c; j++){    
	              sumRow = sumRow + a[i][j];    
	            }    
	            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
	        }  
	        for(int i = 0; i < c; i++){    
	            sumCol = 0;    
	            for(int j = 0; j < r; j++){    
	              sumCol = sumCol + a[j][i];    
	            }    
	            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  

	}

}
}
