package com.other;

import com.util.Node;

/**
 * 约瑟夫问题
 * N个人站成一个环，从第一个人开始报数，报到M的人出环，从下一个人开始重复之前的动作，直到环中只剩2人。求2人在初始环中的位置。
 * @author 杨帆
 */
public class JosephusProblem {
	
	public static void func(Node head, int m) {
		if(head.getNext().getNext().getData() == head.getData()) {
			System.out.println("计算结束，只剩两个人：" + head.getData() + " " + head.getNext().getData());
		} else {
			Node current = null;
			Node newHead = null;
			int i = 0;
			while(i < m) {
				if(i == 0) {
					current = head;
				} else if(i == m - 1) {
					System.out.println(current.getNext().getData() + " killed");
					newHead = current.getNext().getNext();
					current.setNext(current.getNext().getNext());
				} else {
					current = current.getNext();
				}
				i++;
			}
			func(newHead, m);
		}
	}
	

	public static void main(String[] args) {
		
		// 构造环状链表
		int n = 41;
		Node head = null;
		Node pre = null;
		Node node = null;
		for(int i = 0; i < n; i++) {
			node = new Node(i + 1);
			if(i == 0) {
				head = node;
				pre = head;
			} else if(i == n - 1) {
				pre.setNext(node);
				node.setNext(head);
			} else {
				pre.setNext(node);
				pre = node;
			}
		}
		
		// 打印环状链表
		Node tmpNode = head;
		while(true) {
			System.out.print(tmpNode.getData() + " ");
			tmpNode = tmpNode.getNext();
			if(tmpNode.getData() == 1) {
				System.out.println("end");
				break;
			}
		}
		
		func(head, 3);
	}
}
