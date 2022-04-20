package com.bridgelabz.linkedlist;
/*
 * MyNode class implements INode interface
 */
public class MyNode<K> implements INode<K>{
	private K key;
	private INode<K> next;
    
	/*
	 * Constructor 
	 */
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	/*
	 * Getter and setter methods to access private variables
	 */
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;		
	}	
}
