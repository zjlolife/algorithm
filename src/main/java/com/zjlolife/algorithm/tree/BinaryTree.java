package com.zjlolife.algorithm.tree;

public class BinaryTree {

	private Node root;

	public static void main(String[] args) {

	}

	public Node find(String data) {

		Node current = root;
		for (;;) {
			if (current == null) {
				return null;
			}
			if (current.data.compareTo(data) > 0) {
				current = root.left;
			}
			else if (current.data.compareTo(data) < 0){
				current = root.right;
			}
		}




	}

	public void insertNode() {

	}

	public void deleteNode() {

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
