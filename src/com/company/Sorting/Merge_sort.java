package com.company.Sorting;

// split the elements until only one element remains 

public class Merge_sort {
	public static void main(String[] args) {
		int arr[] = {1,10,5,6,7,8};
		int s = 0;
		int e = arr.length-1;
		mergeSort(arr, s, e);
		for (int num : arr) {
            System.out.print(num + " ");
        }
	}
	
	static void mergeSort(int[] arr, int s, int e){
		// base code
		if(s >=e) return;
		
		// process
		int mid = s+(e-s)/2;
		
		// function call
		mergeSort(arr, s, mid);
		mergeSort(arr, mid + 1, e);
		
		// Merge 2 sorted array
		merge(arr, s, mid, e);
	
	}
	
	static void merge(int arr[], int s, int mid, int e) {
		int temp[] = new int[e-s+1];
		int l = s;
		int r = mid+1;
		int idx = 0;
		
		while(l < mid+1 && r<=e) {
			if(arr[l] <= arr[r]) {
				temp[idx] = arr[l];
				l ++;
			}else {
				temp[idx] = arr[r];
				r ++;
			}
			idx ++;
		}
		
		while(l < mid+1) {
			temp[idx] = arr[l];
			l ++;
			idx ++;
		}
		
		while(r <= e) {
			temp[idx] = arr[r];
			r ++;
			idx ++;
		}
		
		for (int i = 0; i < temp.length; i++) {
            arr[s + i] = temp[i];
        }
		
	}
}
