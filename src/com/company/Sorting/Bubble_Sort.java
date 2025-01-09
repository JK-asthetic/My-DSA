package com.company.Sorting;

public class Bubble_Sort {
	public static void main(String[] args) {
		int arr[] = {4,5,3,1,2,0,1,5,2,5,1,0};
		Bubble_sort(arr, arr.length);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	static void Bubble_sort(int arr[], int n) {
		for(int turn = 1; turn < arr.length; turn ++) {
			for(int i = 0; i < (arr.length - turn); i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
	}
}
