package com.ds.org;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		private ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// display method to display list
	private void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	// display method to display list
	private void display(ListNode list) {
		ListNode current = list;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	// add the element in the begging of the list;
	private void beggingList(int value) {
//		ListNode current = head;
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;

	}

	private void addAtGivenPos(int value, int position) {
		ListNode node = new ListNode(value);

		if (position == 1) {
			node.next = head;
			head = node;
		}

		ListNode previous = head;
		int count = 0;
		while (count < position - 1) {
			previous = previous.next;
			count++;
		}
		ListNode tail = previous.next;
		System.out.println(tail.data);
//		System.out.println(previous.data + " " + node.data);
		previous.next = node;
		System.out.println(previous.data);
		node.next = tail;
	}

	// delete first node from the singly linked list
	private ListNode deleteFirstNode() {
		if (head == null) {
			return null;
		}
		ListNode tmpListNode = head;
		head = head.next;
		tmpListNode.next = null;
		return tmpListNode;
	}

	// deleting the last element of the singly linked list
	private ListNode deleteLastNode() {
		if (head == null || head.next == null)
			return null;

		ListNode current = head;
		ListNode previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}

	// delete the node at given postion
	private void deleteAtPosition(int position) {
		ListNode current = head;
		if (position == 1) {
			current = head.next;
			head = current;
		}

		int count = 0;
		ListNode previous = null;
		while (count < position - 1) {
			previous = current;
			current = current.next;
			count++;
		}
		ListNode temp = current;
		previous.next = temp.next;
	}

	// search the data in the singly linked list
	private boolean searchData(int data) {
		ListNode current = head;
		while (current.next != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// reverse the singly linked list in java
	private ListNode reverseList() {
		ListNode current = head;
		ListNode reverse = null;
		ListNode newNode = null;
		while(current != null) {
			newNode= current.next;
			current.next = reverse;
			reverse = current;
			current = newNode;		
			
		}
		return reverse;
		
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();

		// Adding List
		sll.head = new ListNode(3);
		ListNode two = new ListNode(6);
		ListNode three = new ListNode(10);
		ListNode four = new ListNode(14);
		sll.head.next = two;
		two.next = three;
		three.next = four;

		// display list
//		sll.display();            // output : 3 --> 6 --> 10 --> 14 --> null
//		sll.beggingList(15);      // output : 15 --> 3 --> 6 --> 10 --> 14 --> null
//		sll.addAtGivenPos(20, 1); // output : 20 --> 15 --> 3 --> 6 --> 10 --> 14 --> null
//		sll.addAtGivenPos(12, 3); // output : 20 --> 15 --> 3 --> 12 --> 6 --> 10 --> 14 --> null
//		sll.deleteFirstNode(); // output : 15 --> 3 --> 12 --> 6 --> 10 --> 14 --> null
//		sll.display();

//		sll.deleteLastNode();  // output : 15 --> 3 --> 12 --> 6 --> 10 --> null
//		sll.deleteAtPosition(4);
//		System.out.println( sll.searchData(1));
		sll.display();
		sll.display(sll.reverseList());
	}
}
