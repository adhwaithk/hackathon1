package agemarse;

import java.util.Scanner;

public class identity {
	

	private static final boolean False = false;
	private static final boolean True = false;

	public static void main(String[] args) {
		boolean flag=true;
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
             
            for(int i = 0; i < r; i++){  
                for(int j = 0; j < c; j++){  
                  if(i == j && a[i][j] != 1){  
                      flag = false;  
                      break;  
                  }  
                  if(i != j && a[i][j] != 0){  
                      flag = false;  
                      break;  
                  }  
                }  
            } 
            if(flag)  
                System.out.println("Given matrix is an identity matrix");  
            else  
                System.out.println("Given matrix is not an identity matrix");
	  

}
}
}

