package com.bridgelabz.linkedlist;
/*
 *Author: Prasad
 *Ability to delete the last element in the linked list of sequence 56->30->70
 */

public class MyLinkedList<K> {
	//variables
	public INode<K> head;
	public INode<K> tail;
	
	//constructor
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
    /*
     * Add method to add elements to linked list
     */
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	/*
	 * Traversing the linked list till tail and printing each key 
	 */
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My nodes :");
		INode<K> tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}	
	
	/*
	 * Append method to append elements in linked list 
	 */
	public void append(INode newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	/*
	 * Insert method to insert element between two nodes
	 */
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	/*
	 * pop method to delete first element
	 */
	public INode pop() {
		INode tempINode = this.head;
		this.head = head.getNext();
		return tempINode;
	}
	
	/*
	 * popLast method to delete last element
	 */
	public INode popLast() {
		INode tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode.setNext(null);
		return tempNode;
	}
}
