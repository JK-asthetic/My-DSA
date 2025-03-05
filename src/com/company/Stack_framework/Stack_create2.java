package com.company.Stack_framework;

class Stack{
	int arr[];
	int capacity;
	int top;
	
	public Stack(int size){
		this.arr = new int[size];
		this.capacity = size;
		this.top = -1;
	}
	
	public void push(int num) {
		top ++;
		if(top == capacity) {
			System.out.println("Stack OverFlow");
			return;
		}
		arr[top] = num;
	}
	
	public void peak() {
		System.out.println("the top valur is : " + arr[top]);
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("No value");
		}
		top -= 1;
	}
	
	public void isEmpty() {
		if(top == -1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}

public class Stack_create2 {
	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		st.peak();
		st.pop();

		st.isEmpty();
		
		print_Stack(st);
	}
	
	public static void print_Stack(Stack st) {
		int count = st.top;
		while(count >= 0) {
			System.out.println(st.arr[count]);
			count --;
		}
	}
}
