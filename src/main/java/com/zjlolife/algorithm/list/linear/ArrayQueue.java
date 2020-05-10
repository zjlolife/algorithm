package com.zjlolife.algorithm.list.linear;

public class ArrayQueue {

	private String [] items;

	private int n;

	private int head = -1;

	private int tail = -1;

	public boolean push(String item) {

		if (tail == -1) {
			head = tail = 0;
			items[tail] = item;
			return true;
		}

		if (tail + 1 == n && head == 0) {
			return false;
		}
		else if (tail + 1 == n && head > 0){
			//搬迁数据
			for (int i= head; i<=tail; i++) {
				items[i - head] = items[i];
			}
			head = 0;
			tail = tail - head;
			items[tail + 1] = item;
			tail++;
		}
		else {
			items[tail + 1] = item;
			tail++;
		}

		return true;
	}

	public String pop() {
		if (head == -1) {
			return null;
		}
		String item = items[head];
		if (head == tail) {
			head = tail = -1;
		}
		return item;
	}
}
