package test;

public class Maxno {
	public static void main(String args[]) {
		int[] arr= new int[5];
		arr[0]=7;
		arr[1]=10;
		arr[2]=13;
		arr[3]=51;
		arr[4]=17;
		int max =0;
		int smax =0;
		for(int i=0;i<5;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
