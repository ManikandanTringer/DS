package main.java.LinkedList;


import java.util.Scanner;
//Singly Linked List
public class LinkedList {

	Node head; // first node of the list

	// LinkedList Node
	
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d)
		{
			data = d;
			next = null;
		}
	}


	// Method to insert a new node
	public static LinkedList insert(LinkedList list,
									int data)
	{
		
		Node new_node = new Node(data);
		new_node.next = null;

	
		if (list.head == null) {
			list.head = new_node;
		}
		else {
		
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

		// Return the list by head
		return list;
	}



	// Method to print the LinkedList.
	public static void printList(LinkedList list)
	{
		Node currNode = list.head;

		System.out.print("\nLinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			
			currNode = currNode.next;
		}
		System.out.println("\n");
	}



	// to delete a node in the LinkedList by KEY
	public static LinkedList deleteByKey(LinkedList list,
										int key)
	{
		// Store head node
		Node currNode = list.head, prev = null;

	
		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; // Changed head

			// Display the message
			System.out.println(key + " found and deleted");

		
			return list;
		}

		

		while (currNode != null && currNode.data != key) {
			
			prev = currNode;
			currNode = currNode.next;
		}

		
		if (currNode != null) {
		
			prev.next = currNode.next;

		
			System.out.println(key + " found and deleted");
		}

		
		if (currNode == null) {
			
			System.out.println(key + " not found");
		}

	
		return list;
	}

	


	public static LinkedList
	deleteAtPosition(LinkedList list, int index)
	{
	
		Node currNode = list.head, prev = null;

		
		if (index == 0 && currNode != null) {
			list.head = currNode.next; // Changed head

			
			System.out.println(
				index + " position element deleted");

		
			return list;
		}

		
		int counter = 0;

	
		while (currNode != null) {

			if (counter == index) {
			
				prev.next = currNode.next;

				// Display the message
				System.out.println(
					index + " position element deleted");
				break;
			}
			else {
				// If current position is not the index
				// continue to next node
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}

	
		if (currNode == null) {
			
			System.out.println(
				index + " position element not found");
		}


		return list;
	}



	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		Scanner input=new Scanner(System.in);
		int choice=0;
	
		System.out.println("\nChoose the operation : \n	1 -> Insertion of the node \n	2 -> to delete by key \n	3 -> print the Linkedlist \n	4 ->print the size of the stack \n	5 -> Exit");
		choice=input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the element to insert a node");
			int tem=input.nextInt();
			list = insert(list, tem);
			break;
		
		case 2:
			System.out.println("Enter the key to delete a node");
			int key =input.nextInt();
			deleteByKey(list, key);
			break;
		
		case 3:
			printList(list);
			break;
		case 4:
			System.out.println("Enter the position to delete a node");
			int pos =input.nextInt();
			deleteAtPosition(list, pos);
			break;
		
		}
	
		}

	}

