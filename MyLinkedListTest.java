package com.bridgelabz.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	@Test
	public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
		//Key assigned to each node using object
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		//To store the address of next node
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		//Boolean result to check three numbers linked or not
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
				         mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	/*
	 * Test case to check add method
	 */
	@Test
	public void givenThreeNumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		//Key assigned to each node using object
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		//object
		MyLinkedList myLinkedList = new MyLinkedList();
		//calling add method to add elements to linked list
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		//calling printMyNodes method to print the key of each node
		myLinkedList.printMyNodes();
		
		//test condition
		boolean result = myLinkedList.head.equals(myThirdNode) &&
				         myLinkedList.head.getNext().equals(mySecondNode) &&
				         myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
	/*
	 * Test case to check append method
	 */
	@Test
	public void givenThreeNumbersWhenAppendedToLinkedListShouldBeAddedToLast() {
		//Key assigned to each node using object
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		//object
		MyLinkedList myLinkedList = new MyLinkedList();
		//calling append method
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		//calling printMyNodes method
		myLinkedList.printMyNodes();
		
		//test condition
		boolean result = myLinkedList.head.equals(myFirstNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
