//program to find sum of prime no in array
package test;

public class PrimeNoSum {
    public static void main(String args[]) {
        int[] arr = new int[5];
        arr[0] = 7;
        arr[1] = 10;
        arr[2] = 13;
        arr[3] = 51;
        arr[4] = 17;
        int sum = 0;

		for(int i=0;i<5;i++) {
		boolean flag= false;
		int num= arr[i];
			for(int j=2;j<num;j++) {
				if(num %j==0) {
					flag=true;
				}
			}
			if(flag==true) {
				System.out.println("composite" +arr[i]);
			}else {
				sum += arr[i];
                System.out.println("Prime number: " + arr[i]);
				
			}
		}

        System.out.println("Sum of all prime numbers = " + sum);
    }
}
