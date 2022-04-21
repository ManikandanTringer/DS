package main.java.Stack;

import java.util.Scanner;

public class Stack {
	

	  // store elements of stack
	  private int arr[];
	  //top of stack
	  private int top;
	  // total capacity of the stack
	  private int capacity;

	  // Creating a stack
	  Stack(int size) {
	    // initialize the array
	    // initialize the stack variables
	    arr = new int[size];
	    capacity = size;
	    top = -1;
	  }

	  // push elements to the top of stack
	  public void push(int x) {
	    if (isFull()) {
	      System.out.println("Stack OverFlow");

	      // terminates the program
	      System.exit(1);
	    }

	    // insert element on top of stack
	    System.out.println("Inserting " + x);
	    arr[++top] = x;
	  }

	  // pop elements from top of stack
	  public int pop() {

	    // if stack is empty
	    // no element to pop
	    if (isEmpty()) {
	      System.out.println("STACK EMPTY");
	      // terminates the program
	      System.exit(1);
	    }

	    // pop element from top of stack
	    return arr[top--];
	  }

	  // return size of the stack
	  public int getSize() {
	    return top + 1;
	  }

	  // check if the stack is empty
	  public Boolean isEmpty() {
	    return top == -1;
	  }

	  // check if the stack is full
	  public Boolean isFull() {
	    return top == capacity - 1;
	  }

	  // display elements of stack
	  public void printStack() {
	    for (int i = 0; i <= top; i++) {
	      System.out.print(arr[i] + ", ");
	    }
	  }

	  public static void main(String[] args) {
		  
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the capacity of the stack");
	    int n=input.nextInt();
	    
		Stack stack = new Stack(n);
		int choice=0;
		while(choice<5) {
		System.out.println("Choose the operation : \n	1 -> push \n	2 -> pop \n	3 -> print the stack \n	4 ->print the size of the stack ");
		choice=input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the number to push");
			int tem=input.nextInt();
			stack.push(tem);
			break;
		
		case 2:
			stack.pop();
			break;
		
		case 3:
			stack.printStack();
			break;
		case 4:
			System.out.println("size of the stack : "+stack.getSize());
			break;
		
		}
	
		}

	  }}
	

