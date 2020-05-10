package com.zjlolife.algorithm.list.linear;

/**
 * 循环数组 不要搬迁
 */
public class CycleQueue {

	private String [] items;

	private int n;

	//记录队列大小 容易理解对空和队满
	private int size;

	private int head = 0;

	private int tail = 0;

	public boolean push(String item) {

		if (size == n) {
			return false;
		}
		items[tail] = item;
		tail = (tail + 1) % n;
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
