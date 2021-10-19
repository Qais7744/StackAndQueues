package com.bl.stackAndQueues;

import org.junit.Test;
import com.bl.linkedList.INode;
import com.bl.linkedList.MyNode;
import junit.framework.Assert;

public class MyStackTest {
	@Test
	public void given3NumberWhenAddedToStackshouldHavaLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack= new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode peak = myStack.peak();
		System.out.println("Added Node by push Method");
		myStack.printStack();
		System.out.println();
		Assert.assertEquals(myThirdNode, peak);
	}
	
	@Test
	public void given3NumberInStackWhenPopedshouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack= new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = myStack.pop();
		System.out.println("Remove First Node by pop Method");
		myStack.printStack();
		System.out.println();
		Assert.assertEquals(myThirdNode,pop);
	}
	
}
