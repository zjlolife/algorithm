package com.zjlolife.algorithm.list.linear;

public class Browser {

	private LinkStack xStack = new LinkStack();

	private LinkStack yStack = new LinkStack();

	public void visit(int page) {
		xStack.push(page);
		yStack.clear();
	}

	public void forward() {
		Integer page = yStack.pop();
		xStack.push(page);
	}

	public void back() {
		Integer page = xStack.pop();
		yStack.push(page);
	}
}
