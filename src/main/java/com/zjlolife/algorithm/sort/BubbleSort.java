package com.zjlolife.algorithm.sort;

public class BubbleSort {

	public static void main(String [] args) {
		int [] array = new int[]{1, 5, 4, 8, 9};
		int [] array1 = new int[]{1, 4, 4, 8, 9};
		int [] array2 = new int[]{10, 6, 4, 5, 9};

		bubbleSort(array);
		bubbleSort(array1);
		bubbleSort(array2);
		print(array);
		print(array1);
		print(array2);
	}

	public static void bubbleSort(int [] array) {
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j=0; j< array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
	}

	public static void print(int[] array) {
		for (int a : array) {
			System.out.print(a + ",");
		}
		System.out.println("");
	}
}
