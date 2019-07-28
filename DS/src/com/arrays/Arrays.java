package com.arrays;

/* Array use-cases*/
public class Arrays {
	public static void main(String []args) {
		int []arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Original      : ");
		for (int i =0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//rotateBruteForce(arr, 2);
		rotateWithReversalAlgo(arr,2);
		printArray(arr, 2);
		
	}
	
	//Brute Force Method
	/*
	 * Alog :
	 * 1. Elements to be rotated in temp array
	 * 2. Shift remaining elements to start of array
	 * 3. Add temp elements to the end of array
	 * 
	 * O(n) - time complexity
	 * O(rotateTimes) - space complexity
	 */
	public static void rotateBruteForce(int[] arr, int rotateTimes) {
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
		
		printArray(arr, rotateTimes);
		
	}
	
	//Reversal Alog.
		/*
		 * Alog :
		 * 1. Divide array in 2 parts, division can be based on rotateTimes
		 * 2. reverse 1st half array
		 * 3.reverse 2nd half array
		 * 4. Reverse whole array
		 * 
		 * O(n) - time complexity
		 * O(1) - space complexity
		 */
	public static void rotateWithReversalAlgo(int[] arr, int rotateTimes) {
		reverse(arr, 0, rotateTimes-1);
		reverse(arr, rotateTimes, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}
	
	public static void reverse(int[] arr,int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}
	
	public static void printArray(int [] arr, int rotateTimes) {
		//print rotated array
				System.out.print("\nRotated by "+rotateTimes+" : ");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
	}
	
}
