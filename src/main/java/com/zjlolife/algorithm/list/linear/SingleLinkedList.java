package com.zjlolife.algorithm.list.linear;

/**
 * 单链表
 * @param <T>
 */
public class SingleLinkedList<T> {

	private Node<T> head;

	private Node<T> tail;


	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public void addNode(T t) {
		Node<T> node = new Node<T>(t);
		if (head == null) {
			head = node;
			tail = head;
		}
		else {
			tail.next = node;
			tail = node;
		}
	}

	public boolean removeNode(T t) {
		for(Node<T> node = head; node != null; node = node.next) {
			Node<T> nextNode = node.next;
			if (node == head) {
				if (head.data.equals(t)) {
					head.next = null;
					head = nextNode;
					return true;
				}
			}
			if (node.next != null && node.next.data.equals(t)) {
				node.next = node.next.next;
				nextNode.next = null;
				return true;
			}
		}
		return false;
	}

	public void foreach() {
		for (Node<T> node = head; node != null; node = node.next) {
			System.out.println(node.data);
		}
	}

	private static class Node<T> {

		private T data;

		private Node<T> next;

		Node(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
}
