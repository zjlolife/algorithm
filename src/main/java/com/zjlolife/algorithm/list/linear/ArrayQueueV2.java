package com.zjlolife.algorithm.list.linear;

/**
 * 需要搬迁的数组
 */
public class ArrayQueueV2 {

	private String [] items;

	private int n;

	private int size;

	private int head = 0;

	private int tail = 0;

	public boolean push(String item) {
		if (size == n) {
			if (head == 0) {
				return false;
			}
			for(int i=head; i< tail; i++) {
				items[i - head] = items[i];
			}
			tail -= head;
		}
		items[tail] = item;
		tail++;
		size++;
		return true;
	}

	public String pop() {
		if (size == 0) {
			return null;
		}
		String item = items[head];
		head++;
		size--;
		return item;
	}
}
