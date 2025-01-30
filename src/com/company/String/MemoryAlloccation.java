package com.company.String;

public class MemoryAlloccation {
	public static void main(String[] args) {
		
		String s1 = "Hello bhai";
		String s0 = "Hello bhai";
		String s2 = new String("Hello Bhai");
		String s3 = new String("Hello Bhai");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println(s1 == s0); // true
		System.out.println(s2 == s3); // false
		System.out.println(s1 == s3); // fasle
		
		
		// String pool assigns same memoru loaction to same string as it 
		// does not contain same element 
		
		// With new keywork it creates an entirely new location for string data
		
		
		
		// for checking the loactions
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s0));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		
	}
}
