package com.zjlolife.algorithm.list.linear.question;

public class PalindromeString {

	/**
	 * 如果字符串是通过单链表来存储的，那该如何来判断是一个回文串呢。如“level”
	 * @param args
	 */

	public static void main(String [] args) {
		Node node1 = new Node('l');
		Node node2 = new Node('e');
		Node node3 = new Node('v');
		Node node4 = new Node('e');
		Node node5 = new Node('l');
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		palindrome(node1);
	}

	public static boolean palindrome(Node listNode) {
		Node aCurrentNode = listNode;
		Node bCurrentNode = listNode;
		Node mCurrentNode = null;
		boolean flag = true; //true表示奇数，false表示偶数
		for (;;) {
			if (bCurrentNode.next == null) {
				mCurrentNode = aCurrentNode;
				flag = true;
				break;
			}
			if (bCurrentNode.next.next == null) {
				mCurrentNode = aCurrentNode;
				flag = false;
				break;
			}
			aCurrentNode = aCurrentNode.next;
			bCurrentNode = bCurrentNode.next.next;
		}

		if (flag) {
			Node hNode = reserved(mCurrentNode);
			Node aNode = listNode;
			Node bNode = hNode;
			for (;;) {
				if (aNode == mCurrentNode) {
					return true;
				}
				if (aNode.c != bNode.c) {
					return false;
				}
				aNode = aNode.next;
				bNode = bNode.next;
			}
		}
		else {

		}
		return false;
	}

	private static Node reserved(Node listNode) {
		Node currentNode = listNode.next;
		Node newNode = listNode;
		newNode.next = null;
		for (;;) {
			if (currentNode == null) {
				return newNode;
			}
			Node next = currentNode.next;
			currentNode.next = newNode;
			newNode = currentNode;
			currentNode = next;
		}
	}

	/**
	 * examples as 'aba', 'noon', 'level'
	 */
	private static class Node {

		public Node(char c) {
			this.c = c;
		}

		public char c;

		public Node next;

	}
}

