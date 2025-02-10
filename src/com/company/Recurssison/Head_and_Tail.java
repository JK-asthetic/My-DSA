package com.company.Recurssison;

import java.util.Scanner;

public class Head_and_Tail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		head_tail(n);
		sc.close();
	}
	
	static void head_tail(int n) {
		String res = "";
		count_toss(n, res);
	}
	
	static void count_toss(int n, String res) {
		if(n == 0) {
			System.out.println(res);
			return;
		}
		
		// process
		count_toss(n-1, res+"H");
		count_toss(n-1, res+"T");
		
	}
}
