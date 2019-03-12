package com.arrays;

public class Arrays {
	public static void main(String []args) {
		int []arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Original      : ");
		for (int i =0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		rotate(arr, 4);
	}
	
	//Brute Force Method
	/*
	 * Alog :
	 * 1. Elements to be rotated in temp array
	 * 2. Shift remaining elements to start of array
	 * 3. Add temp elements to the end of array
	 * 
	 * O(n) - time complexity
	 * O(n)
	 */
	public static void rotate(int[] arr, int rotateTimes) {
		int displacement = rotateTimes%(arr.length); //If rotattion is asked more than size of array, to adjust for this requirement we use MOD operator.
		int[] temp = new int[displacement];
		for(int i=0; i<displacement;i++) {
			temp[i] = arr[i];
		}
		
		for(int i=0,j=displacement;j<arr.length;i++,j++) {
			arr[i] = arr[j];
		}
		
		for(int i=0, j=temp.length;i<temp.length;i++,j--) {
			arr[(arr.length) - j] = temp[i];
		}
		
		//print rotated array
		System.out.print("\nRotated by "+rotateTimes+" : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//Reversal Alog.
	
}
