package com.zjlolife.algorithm.list.linear;

public class LinkedListTest {

	public static void main(String [] args) {
		SingleLinkedList<Data> singleLinkedList = new SingleLinkedList<Data>();
		singleLinkedList.addNode(new Data(1L, "data1"));
		singleLinkedList.addNode(new Data(2L, "data2"));
		singleLinkedList.addNode(new Data(3L, "data3"));
		singleLinkedList.addNode(new Data(4L, "data4"));
		singleLinkedList.foreach();
		singleLinkedList.removeNode(new Data(4L, "data1"));
		singleLinkedList.foreach();
	}


}
