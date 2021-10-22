package com.bl.queues;

import org.junit.Test;
import com.bl.linkedList.INode;
import com.bl.linkedList.MyNode;
import junit.framework.Assert;

public class MyQueueTest {
	
	@Test
	public void given3NumberWhenEnqueueToQueueshouldHavaLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue= new MyQueue();
		myQueue.Enqueue(myFirstNode);
		myQueue.Enqueue(mySecondNode);
		myQueue.Enqueue(myThirdNode);
		INode peak = myQueue.peak();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, peak);
		
	}
}
