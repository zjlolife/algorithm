package com.zjlolife.algorithm.list.linear;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * 循环数组实现无锁队列
 */
public class LockFreeCycleQueue<E> {
	private AtomicReferenceArray<E> array;
	private volatile AtomicInteger head = new AtomicInteger(0);
	private volatile AtomicInteger tail = new AtomicInteger(0);

	public LockFreeCycleQueue(int n) {
		this.array = new AtomicReferenceArray<E>(n + 1);
	}

	public void push(E item) {
		int n = array.length() - 1;
		for(;;) {
			int index = tail.get();
			if ((index & n) + 1 == (head.get() & n)) {
				continue;
			}
			if (!array.compareAndSet(index, null, item)) {// 此处只有一个push线程cas成功
				continue;
			}
			tail.incrementAndGet();  //这一步可能还没执行，就被pop线程执行，但是没有影响, 因为head追不上tail的
			return;
		}
	}

	public E pop() {
		int n = array.length() -1;
		for(;;) {
			int index = head.get();
			if ((tail.get() & n) == (index & n)) {
				continue;
			}
			E currentItem = array.get(index);
			if (!array.compareAndSet(index, currentItem, null)) { //此处只有一个pop线程能cas成功
				continue;
			}
			head.incrementAndGet(); //这一步可能还没来得及执行，就被push线程占有了，但是没有影响，因为tail 指针追不上来的
			return currentItem;
		}
	}


}
