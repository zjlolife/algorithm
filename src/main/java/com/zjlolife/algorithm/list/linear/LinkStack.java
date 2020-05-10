package com.zjlolife.algorithm.list.linear;

public class LinkStack {

	private ListNode head;

	public boolean push(Integer val) {
		if (head == null) {
			head = new ListNode(val);
		}
		else {
			head.next = new ListNode(val);
		}
		return true;
	}

	public Integer pop() {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			Integer val = head.val;
			head = null;
			return val;
		}
		ListNode currentNode = head;
		for (;;) {
			if (currentNode.next.next == null) {
				ListNode popNode = currentNode.next;
				Integer val = currentNode.val;
				currentNode.next = null;
				return val;
			}
		}
	}

	public void clear() {
		head = null;
	}


}
