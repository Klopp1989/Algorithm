package com.chapter06;

import com.util.Node;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		SingleList sl = new SingleList();
		sl.add(new Node(1, null));
		sl.add(new Node(2, null));
		sl.add(new Node(3, null));
		sl.add(new Node(4, null));
		sl.add(new Node(3, null));
		sl.add(new Node(2, null));
		sl.add(new Node(1, null));
		
		sl.show();
		reverse(sl);
		sl.show();
		
	}
	
	/**
	 * 链表反转
	 * @param sl
	 */
	public static void reverse(SingleList sl) {
		if(sl.getHead() != null && sl.getHead().getNext() != null) {
			Node preNode = sl.getHead();
			Node node = sl.getHead().getNext();
			while(true) {
				Node nextNode = node.getNext();
				
				node.setNext(preNode);
				
				if(nextNode == null) {
					break;
				}
				preNode = node;
				node = nextNode;
			}
			sl.getHead().setNext(null);
			sl.setHead(node);
		}
	}
	
	
	public static void findMiddle(SingleList sl) {
		
	}

}
