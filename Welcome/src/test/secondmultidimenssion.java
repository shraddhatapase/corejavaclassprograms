package test;

public class secondmultidimenssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	  int[][] arr = new int[4][4];
        for (int p = 0; p < 4; p++) {        // rows
	            for (int q = 0; q < 4; q++) { 
	            	arr[p][q] =p+q;
	            }
	            }

  	        // Print elements using nested loops
  	        System.out.println("2D Array elements:");
  	        for (int i = 0; i < arr.length; i++) {        // rows
  	            for (int j = 0; j < arr[i].length; j++) { // columns
  	                System.out.print(arr[i][j] + " ");
  	            }
  	            System.out.println(); // new line after each row
  	        }
	}

}
