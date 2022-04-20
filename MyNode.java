package com.bridgelabz.linkedlist;
/*
 * Author: Prasad
 * Create a simple linked list of 56, 30 and 70
 */
public class MyNode<k> {
	//variables
	private k key;
	private MyNode<k> next;

	//constructor
	public MyNode(k key) {
		this.key = null;
		this.next = null;
	}
	
	//Getter and setter methods to get and set private variables
	public k getKey() {
		return key;
	}

	public void setKey(k key) {
		this.key = key;
	}

	public MyNode<k> getNext() {
		return next;
	}

	public void setNext(MyNode<k> next) {
		this.next = next;
	}	
}
