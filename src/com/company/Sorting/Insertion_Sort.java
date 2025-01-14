package com.company.Sorting;

// Insertion sort is a simple sorting algorithm that works by iteratively 
// inserting each element of an unsorted list into its correct position in 
// a sorted portion of the list. It is like sorting playing cards in your 
// hands. You split the cards into two groups: the sorted cards and the 
// unsorted cards. Then, you pick a card from the unsorted group and put 
// it in the right place in the sorted group.



public class Insertion_Sort {
	public static void main(String[] args) {
		int arr[] = {10,40,50,20,30,0};
		int res[] = inser_sort(arr);
		
		for (int i : res) {
			System.out.println(i);
		}
	}
	
	static int[] inser_sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}
			}
		}
		return arr;
	}
}


