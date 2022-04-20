package com.bridgelabz.linkedlist;
/*
 * Author: Prasad
 * Create a simple linked list of 56, 30 and 70
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyNodeTest {

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
	
	
}
