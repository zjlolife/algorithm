package com.zjlolife.algorithm.list.linear;

/**
 * 循环数组 不要搬迁
 */
public class CycleQueueV2 {

	private String [] items;

	private int n;

	private int head = 0;

	private int tail = 0;

	public boolean push(String item) {
		if ((tail + 1) % n == head) {
			return false;
		}
		items[tail] = item;
		tail = (tail + 1) % n;
		return true;
	}

	public String pop() {
		if (head == tail) {
			return null;
		}
		String item = items[head];
		head = (head + 1) % n;
		return item;
	}


}
