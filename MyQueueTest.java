package com.bl.queues;

import org.junit.Assert;
import org.junit.Test;

import com.bl.linkedList.INode;
import com.bl.linkedList.MyNode;

public class MyQueueTest {

	@Test
	public void given3NumberWhenDequeueToQueueshouldHaveBeginningNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myStack= new MyQueue();
		myStack.enqueue(myFirstNode);
		myStack.enqueue(mySecondNode);
		myStack.enqueue(myThirdNode);
		INode dequeue = myStack.dequeue();
		myStack.printQueue();
		Assert.assertEquals(myFirstNode, dequeue);
		
	}
}
