package com.bridgelabz.linkedlist;
/*
 *Author: Prasad
 *Ability to delete 40 from the linked list of sequence 56->30->40->70
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
	
	/*
	 * searchNode method to search node with value 30
	 */
	public INode searchNode(int key) {
		INode tempNode = head;
		boolean isKeyPresent = false;
		while(!tempNode.getNext().equals(null) && isKeyPresent == false) {
			if(tempNode.getKey().equals(key)) {
				isKeyPresent = true;
				System.out.println("Key found");
				break;
			}
			else {
				tempNode = tempNode.getNext();
			}
		}
		
		if (isKeyPresent == true) {
			return tempNode;
		}
		else {
			System.out.println("Key not found");
			return head;
		}		
	}

	/*
	 * insertWithKey method to insert node after specific node
	 */
	public void insertWithKey(int key, INode myNewNode) {
		//to search key is present in linked list
		INode nodeWithKeyValue = searchNode(key);
		if(nodeWithKeyValue.getKey().equals(key)) {
			INode tempNode = nodeWithKeyValue.getNext();
			nodeWithKeyValue.setNext(myNewNode);
			myNewNode.setNext(tempNode);
		}
		else {
			System.out.println("Key not found");
		}
	}
	
	/*
	 * deleteWithKey method to delete specific node
	 */
	public void deleteWithKey(int key) {
		INode nodeWithKeyValue = searchNode(key);
		INode tempNode = head;
		if(!nodeWithKeyValue.equals(null)) {
			while(tempNode != null && tempNode.getNext() != nodeWithKeyValue) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(nodeWithKeyValue.getNext());
		}
		else {
			System.out.println("Key not found");
		}
	}
}
