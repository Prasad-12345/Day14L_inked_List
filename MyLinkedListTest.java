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
	 * Test to check append method
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
						 myLinkedList.head.getNext().getNext().equals(myThirdNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	/*
	 * Test case to check insert method
	 */
	@Test
	public void givenThreeNumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		//Key assigned to each node using object
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		//object
		MyLinkedList myLinkedList = new MyLinkedList();
		//calling add method 
		myLinkedList.add(myFirstNode);
		//calling append method
		myLinkedList.append(myThirdNode);
		//calling insert method
		myLinkedList.insert(myFirstNode, mySecondNode);
		//calling print method
		myLinkedList.printMyNodes();
		
		//test condition
		boolean result = myLinkedList.head.equals(myFirstNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	/*
	 * Test case to check pop method
	 */
	@Test
	public void deleteFirstElementInLinkedList() {
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
		
		//calling print method
		System.out.println("Linked list before deletion");
		myLinkedList.printMyNodes();
		
		//calling pop method
		myLinkedList.pop();
		System.out.println("Linked list after deletion");
		myLinkedList.printMyNodes();
		
		//test condition
		boolean result = myLinkedList.head.equals(mySecondNode) &&
						 myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	/*
	 * Test case to check pop last method
	 */
	@Test
	public void deleteLastElementInLinkedList() {
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
		
		//calling print method
		System.out.println("Linked list before deletion");
		myLinkedList.printMyNodes();
		
		//calling popLast method
		System.out.println("Linked list after deletion");
		myLinkedList.popLast();
		myLinkedList.printMyNodes();
		
		//Test Condition
		boolean result = myLinkedList.head.equals(myFirstNode) &&
				         myLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}
	
	/*
	 * Test case to check searchNode method
	 */
	@Test
	public void abilityToSearchLinkedListToFindNodeWithValue30() {
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
		myLinkedList.printMyNodes();
		
		//calling searchNode method
		INode tempNode = myLinkedList.searchNode(30);
		
		//Test condition
		boolean result = tempNode.getKey().equals(30);
	}
	
	/*
	 * Test case to check insertWithKey method
	 */
	@Test
	public void abilityToInsert40After30ToLinkedList() {
		//Key assigned to each node using object
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myNewNode = new MyNode<>(40);
		
		//object
		MyLinkedList myLinkedList = new MyLinkedList();
		
		//calling append method
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		
		System.out.println("----------Linked List before insertion-----------");
		myLinkedList.printMyNodes();
		
		System.out.println("-----------Linked List after insertion------------");
		myLinkedList.insertWithKey(30, myNewNode);
		myLinkedList.printMyNodes();
		
		//Test condition
		boolean result = myLinkedList.head.getNext().equals(mySecondNode) &&
				         mySecondNode.getNext().equals(myNewNode) &&
				         myNewNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
				         
	}
}
