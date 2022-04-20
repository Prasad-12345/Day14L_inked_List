package com.bridgelabz.linkedlist;
/*
 *Author: Prasad
 *Ability to create linked list by adding 30 and 56 to 70
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
     * Add method to elements to linked list
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
	 * Traversing the linked list till tail and printing each node 
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
}
