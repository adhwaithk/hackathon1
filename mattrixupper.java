package agemarse;

import java.util.Scanner;

public class mattrixupper {

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
		  r = a.length;    
          c = a[0].length;    
            
          if(r != c){    
              System.out.println("Matrix should be a square matrix");    
          }  
          else {    
                 
              System.out.println("Upper triangular matrix: ");    
              for(int i = 0; i < r; i++){    
                  for(int j = 0; j < c; j++){    
                    if(i > j)    
                      System.out.print("0 ");    
                    else    
                      System.out.print(a[i][j] + " ");    
                  }    
                  System.out.println();    

	}

}
	}
}
