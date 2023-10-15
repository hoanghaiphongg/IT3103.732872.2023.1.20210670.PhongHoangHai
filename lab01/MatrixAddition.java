//Hoang Hai Phong - 20210670
public class MatrixAddition{  
	public static void main(String args[]){  

		int a[][]={{0,1,2},{1,2,3},{2,3,4}};    // khoi tao ma tran A
		int b[][]={{3,4,5},{4,5,6},{5,6,7}};    // khoi tao ma tran B
    
		int c[][]=new int[3][3];  
        System.out.println("The original Matrix A is: ");
    	for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){      
				System.out.print(a[i][j]+" ");    //in ra ma tran A
			}    
			System.out.println();    
		} 
    	  System.out.println("The original Matrix B is: ");
      	for(int i=0;i<3;i++){    
  			for(int j=0;j<3;j++){      
  				System.out.print(b[i][j]+" ");    //in ra ma tran B
  			}    
  			System.out.println();    
  		} 
  	  System.out.println("The sum of two Matrix is: ");

		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=a[i][j]+b[i][j];    
				System.out.print(c[i][j]+" ");    //in ra tong 2 ma tran
			}    
			System.out.println();    
		}    
	}
}  