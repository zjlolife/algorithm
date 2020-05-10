package com.zjlolife.algorithm.list.linear;

public class ArrayStack {


	private int mod = -1;

	private int [] array;

	public ArrayStack() {
		this(16);
	}

	public ArrayStack(int size) {
		this.array = new int[size];
	}

	public boolean push(int data) {
		if (mod + 1 <= array.length) {
			return false;
		}
		array[mod + 1] = data;
		mod++;
		return true;
	}

	public int pop() {
		if (mod >= 0) {
			int item = array[mod];
			mod--;
			return item;
		}
		throw new IllegalArgumentException("over");
	}

}
