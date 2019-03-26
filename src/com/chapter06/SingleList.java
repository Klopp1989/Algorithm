package com.chapter06;

import com.util.Node;

/**
 * 单向链表
 * @author 杨帆
 */
public class SingleList {
	
	private Node head = null;
	
	public Node getHead() {
		return this.head;
	}
	public void setHead(Node node) {
		this.head = node;
	}
	
	public void add(Node node) {
		if(this.head == null) {
			this.head = node;
		} else {
			Node tail = head;
			while(tail.getNext() != null) {
				tail = tail.getNext();
			}
			tail.setNext(node);
		}
	}
	
	public void show() {
		Node node = this.head;
		while(node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
	}
}
