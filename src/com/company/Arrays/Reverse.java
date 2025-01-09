package com.company.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		int arr1[] = reverseArr(arr);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		
	}
	
	static int[] reverseArr(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			int temp = arr[r];
			arr[r] = arr[l];
			arr[l] = temp;
			l++;
			r--;
		}
		return arr;
	}
}
