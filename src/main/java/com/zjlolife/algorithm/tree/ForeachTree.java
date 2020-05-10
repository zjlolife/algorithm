package com.zjlolife.algorithm.tree;

import com.zjlolife.algorithm.list.linear.ArrayQueueV2;
import com.zjlolife.algorithm.list.linear.ArrayQueueV3;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ForeachTree {

	public static void main(String [] args) {

		Node node1 = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("C");
		Node node4 = new Node("D");
		Node node5 = new Node("E");
		Node node6 = new Node("F");
		Node node7 = new Node("G");


		node1.left = node2;
		node1.right = node3;

		node2.left = node4;
		node2.right = node5;

		node3.left = node6;
		node3.right = node7;

		layerOrder(node1);




	}

	/**
	 * perOrder(Node) = println(Node) + perOrder(Node.left) + perOrder(Node.right)
	 * @param node
	 */
	public static void perOrder(Node node) {

		if (node == null) {
			return;
		}

		printf(node);

		perOrder(node.left);

		perOrder(node.right);

	}

	public static void inOrder(Node node) {
		if (node == null) {
			return;
		}


		inOrder(node.left);

		printf(node);

		inOrder(node.right);

	}

	public static void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		printf(node);
	}


	public static void layerOrder(Node root) {
		ArrayQueueV3<Node> queue = new ArrayQueueV3<Node>(100);
		Node none = new Node(null);
		queue.push(root);
		queue.push(none);
		for(;;) {
			Node node = queue.pop();
			if (node == null) {
				return;
			}
			if (node.data == null) {  //每一层end标志
				if (queue.peek() != null) {
					queue.push(node);
				}
				System.out.println();
				continue;
			}
			printf(node);
			if (node.left != null) {
				queue.push(node.left);
			}
			if (node.right != null) {
				queue.push(node.right);
			}
		}
	}

	private static void printf(Node node) {
		System.out.print(node.getData());
	}


	private static class Node {
		private String data;

		private Node left;

		private Node right;

		public Node(String data) {
			this.data = data;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}
}
