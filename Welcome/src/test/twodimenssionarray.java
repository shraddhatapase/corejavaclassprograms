package test;

public class twodimenssionarray {
    public static void main(String args[]) {
    	  int[][] arr = new int[3][3];
          arr[0][0] = 1;
          arr[0][1] = 2;
          arr[0][2] = 3;
          arr[1][0] = 1;
          arr[1][1] = 2;
          arr[1][2] = 3;
          arr[2][0] = 1;
          arr[2][1] = 2;
          arr[2][2] = 3;


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

