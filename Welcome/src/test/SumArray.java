package test;

public class SumArray {
	public static void main(String args[]) {
		int[] arr= new int[10];
		arr[0]=7;
		arr[1]=10;
		arr[2]=13;
		arr[3]=51;
		arr[4]=17;
		arr[5]=35;
		arr[6]=37;
		arr[7]=2;
		arr[8]=11;
		arr[9]=8;
		int sumevenno = 0;
		int sumododd = 0;
		//System.out.println("sum of even no "+ arr.);
		for(int i=0;i<10;i++) {
			if(arr[i]%2==0) {
				sumevenno = arr[i] + sumevenno;
			}else {
				sumododd = arr[i] + sumododd;
			}
		
		}
		
		System.out.println("sum of even no "+ sumevenno);	
		System.out.println("sum of odd no "+ sumododd);	
		
	}

}
