package com.bl.stackAndQueues;

import org.junit.Test;
import com.bl.linkedList.INode;
import com.bl.linkedList.MyNode;
import junit.framework.Assert;

public class MyStackTest {
	
	@Test
	public void given3NumberWhenEnqueueToQueueshouldHavaLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyStack myStack= new MyStack();
<<<<<<< HEAD
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myThirdNode,pop);
=======
		myStack.Enqueue(myFirstNode);
		myStack.Enqueue(mySecondNode);
		myStack.Enqueue(myThirdNode);
		INode peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myFirstNode, peak);
		
>>>>>>> UC3_EnqueueMethode
	}
	
}
