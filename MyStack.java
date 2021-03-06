package com.bl.stackAndQueues;

import com.bl.linkedList.INode;
import com.bl.linkedList.MyLinkedList;
import com.bl.linkedList.MyNode;

public class MyStack {
	private final MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	
	public void printStack() {
		myLinkedList.printMyNodes();
	}
	
	public INode peak() {
		return myLinkedList.head;
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public void Enqueue(INode myNode) {
		myLinkedList.append(myNode);
		
	}

	public INode dequeue() {
		return myLinkedList.pop();
	}
}
