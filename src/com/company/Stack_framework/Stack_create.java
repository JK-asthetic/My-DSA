package com.company.Stack_framework;

import java.util.Stack;

public class Stack_create {
	public static void main(String[] args) {
		// with java inbuilt stack
		Stack<String> st = new Stack<>();
		
		st.push("A");
		st.push("B");
		st.push("C");
		st.push("D");
		st.push("E");

		// remoeve the top element
		System.out.println(st.pop());

		// see the top element 
		System.out.println(st.peek());
		
		st.pop();
		System.out.println(st.peek());

		System.out.println(st.isEmpty());
		
		// print all element
		while(!st.isEmpty()) {
			System.out.print(st.pop() + " ");
		}		
		
	}
}
