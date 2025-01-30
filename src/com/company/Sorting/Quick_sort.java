package com.company.Sorting;


public class Quick_sort {
	public static void main(String[] args) {
		int arr[] = {1,11,4,5,21,2,3};
		int s = 0;
		int e = arr.length -1;
		quick(arr, s, e);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	static void quick(int arr[], int s , int e) {
		// base case
		if(s >= e) return;
		
		// process (Finding piviot element)
		int pivot = partition(arr, s ,e);
		
		// function call
		quick(arr, s, pivot-1);
		quick(arr, pivot + 1, e);
		
	}
	
	static int partition(int arr[], int s , int e) {
		int pos = s;
		int pivot = arr[e];
		for (int i = s; i <= e; i++) {
			if(arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
				pos ++;
			}
		}
		return pos-1;
	}
	
}
