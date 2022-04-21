package main.java.Queue;

import java.util.Scanner;

public class Queue {
    private static int front, rear, capacity;   
    private static int queue[];   
     
    Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   
     
    // insert an element into the queue  
    static void queueEnqueue(int item)  {   
        // check if the queue is full  
        if (capacity == rear) {   
            System.out.printf("\nQueue is full\n");   
            return;   
        }   
     
        // insert element at the rear   
        else {   
            queue[rear] = item;   
            rear++;   
        }   
        return;   
    }   
     
    //remove an element from the queue  
    static void queueDequeue()  {   
        // check if queue is empty   
        if (front == rear) {   
            System.out.printf("\nQueue is empty\n");   
            return;   
        }   
     
        // shift elements to the right by one place uptil rear   
        else {   
            for (int i = 0; i < rear - 1; i++) {   
                queue[i] = queue[i + 1];   
            }   
     
         
      // set queue[rear] to 0  
            if (rear < capacity)   
                queue[rear] = 0;   
     
            // decrement rear   
            rear--;   
        }   
        return;   
    }   
     
    // print queue elements   
    static void queueDisplay()   
    {   
        int i;   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
     
        // traverse front to rear and print elements   
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;   
    }   
     
    // print front of queue   
    static void queueFront()   
    {   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        System.out.printf("\nFront Element of the queue: %d", queue[front]);   
        return;   
    }   
   
   

    public static void main(String[] args) {   
    	Scanner input=new Scanner(System.in);
    	System.out.println("Enter the capacity of the Queue");
        int capacity=input.nextInt();  
        Queue queue = new Queue(capacity);   
        int choice=0;
		
		System.out.println("Choose the operation : \n	1 -> queueEnqueue \n	2 -> queueDequeue \n	3 -> print the queue \n	4 -> print front of queue \n	");
		choice=input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the number to Enqueue");
			int temp=input.nextInt();
			queueEnqueue(temp);
			break;
		
		case 2:
			queueDequeue();
			break;
		
		case 3:
			queueDisplay();
			break;
		case 4:
			queueFront();
			break;
		
		}
	
		}
       
    }   

