package com.zjlolife.algorithm.list.linear;

/**
 * 需要搬迁的数组
 */
public class ArrayQueueV3<T> {

	private Object [] items;

	private int n;

	private int size;

	private int head = 0;

	private int tail = 0;

	public ArrayQueueV3(int n) {
		this.n = n;
		this.items = new Object[n];
	}

	public boolean push(T item) {
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

	public T pop() {
		if (size == 0) {
			return null;
		}
		T item = (T)items[head];
		head++;
		size--;
		return item;
	}

	public T peek() {
		if (size == 0) {
			return null;
		}
		T item = (T)items[head];
		return item;
	}
}
