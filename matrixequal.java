package agemarse;

import java.util.Scanner;

public class matrixequal {

	public static void main(String[] args) {
		boolean flag = true; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows and cols");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int[][]a=new int[r][c];
		int[][]b=new int[r][c];
		
		System.out.println("enter the elements of first matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("enter the elements of second matrix");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++)
				b[i][j]=sc.nextInt();
		}
		 r = a.length;    
	        c = a[0].length;    
	            
	         
	    
	          r1 = b.length;    
	        c = b[0].length;    
	            
	        //Checks if dimensions of both the matrices are equal    
	        if(r != r1 || c != c1){    
	            System.out.println("Matrices are not equal");    
	        }    
	        else {    
	            for(int i = 0; i < r; i++){    
	                for(int j = 0; j < c; j++){    
	                  if(a[i][j] != b[i][j]){    
	                      flag = false;    
	                      break;    
	                  }    
	                }    
	            }    
	                
	            if(flag)    
	                System.out.println("Matrices are equal");    
	            else    
	                System.out.println("Matrices are not equal");   

	}

}
}
