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
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode dequeue = myQueue.dequeue();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, dequeue);
	}
}
