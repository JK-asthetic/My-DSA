package com.company.Searching;

public class Binary_Search {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,11,13,16};
		int index = Search(arr, 11);	
		System.out.println(index);	
	}
	
	static int Search(int[] arr, int key) {
		int left = 0;
		int right = arr.length-1;
		
		int index = 0;
		if(arr[left] == key) {
			return left;
		}else if(arr[right] == key){
			return right;
		}else {
			while(left<right) {
				if(arr[index] == key) {
					return index;
				}		
				index = (left + right) / 2;			
			}
		}
		return index;
	}
}
