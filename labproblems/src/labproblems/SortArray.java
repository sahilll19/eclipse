package labproblems;

import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		//initializing elements
		arr[0]= 9;
		arr[1]=4;
		arr[2]=7;
		arr[3]=8;
		arr[4]=5;
		
		
//		for(int i=0;i<=arr.length;i++)
//			System.out.println(arr[i]);
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
			
			
			
			
	}

}
