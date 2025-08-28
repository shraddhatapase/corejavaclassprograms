// prime no and composite no from array in java
package test;

public class Primeno {

public static void main(String args[]) {
	int[] arr= new int[5];
	arr[0]=7;
	arr[1]=10;
	arr[2]=13;
	arr[3]=51;
	arr[4]=17;
	
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
				System.out.println("prime" +arr[i]);
			}
		}
	}
		
}

