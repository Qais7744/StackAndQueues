package com.bl.queues;

<<<<<<< HEAD
import org.junit.Test;
import com.bl.linkedList.INode;
import com.bl.linkedList.MyNode;
import junit.framework.Assert;

public class MyQueueTest {
	
	@Test
	public void given3NumberWhenEnqueueToQueueshouldHavaLastAddedNode() {
=======
import org.junit.Assert;
import org.junit.Test;

import com.bl.linkedList.INode;
import com.bl.linkedList.MyNode;

public class MyQueueTest {

	@Test
	public void given3NumberWhenDequeueToQueueshouldHaveBeginningNode() {
>>>>>>> UC4_DnqueueMethode
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
<<<<<<< HEAD
		INode peak = myQueue.peak();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, peak);
=======
		INode dequeue = myQueue.dequeue();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, dequeue);
<<<<<<< HEAD
>>>>>>> UC4_DnqueueMethode
		
=======
>>>>>>> UC4_DnqueueMethode
	}
}
