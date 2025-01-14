package com.company.Sorting;


// It sorts an array by repeatedly selecting the smallest (or largest)
// element from the unsorted portion and swapping it with the first 
// unsorted element. This process continues until the entire array is sorted.


public class Selection_sort {
	 public static void main(String[] args) {
		int arr[] = {3,2,4,1,5};
		int res[] = Selection(arr);
				
		for (int i : res) {
			System.out.print(i + " ");
		}
	 }
 
	 static int[] Selection(int[] arr){
		 for (int i = 0; i < arr.length-1; i++) {
			int index = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[index] > arr[j]) {
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		 return arr;
	 }
}
