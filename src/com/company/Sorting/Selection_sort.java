package com.company.Sorting;

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
