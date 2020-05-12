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

	public void insertNode(String data) {
		Node insertNode = new Node(data);

		Node current = root;

		for (;;) {
			if (current.data.compareTo(data) < 0) {
				if (current.left == null) {
					current.left = insertNode;
					return;
				}
				current = current.left;
			}
			else {
				if (current.right == null) {
					current.right = insertNode;
					return;
				}
				current = current.right;
			}
		}

	}

	public void deleteNode(String data) {

		Node pp = new Node(null);
		pp.left = root;
		Node current = root;
		for (;;) {
			if (current == null) {
				return;
			}
			if (current.data.compareTo(data) == 0) {

				//删除结点为叶子结点
				if (current.left == null && current.right == null) {
					if (pp.left == current) {
						pp.left = null;
					}
					else {
						pp.right = null;
					}
					return;
				}


				//删除结点为只有一个左叶子结点 或者 右叶子结点
				if (pp.left == null || pp.right == null) {
					pp.left = null;
					pp.right = null;
					return;
				}


				//删除结点 有左右两个子结点
				//方案1：找到左子树的最小值 更更新为当前结点
				Node maxPp = current;
				Node maxP =  current.left;
				for (;;) {

					if (maxP.right == null) {
						break;
					}
					maxPp = maxP;
					maxP = maxP.right;
				}

				if (pp.left == current) {
					pp.left = maxP;
				}
				else {
					pp.right = maxP;
				}
				maxPp.right = null;


			}
			else if (current.data.compareTo(data) > 0) {
				pp = current;
				current = current.left;
			}
			else {
				pp = current;
				current = current.right;
			}
		}

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
