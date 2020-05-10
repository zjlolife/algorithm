package com.zjlolife.algorithm.sort;

public class InsertionSort {

	/**
	 * 关键在于找到插入位置
	 * @param array
	 */

	public static void insertionSort(int[] array) {

		int n = array.length;
		for (int i=1; i<n; i++) {
			int value = array[i];
			int j=i-1;
			for (; j>=0; j--) {
				if (array[j] > value) {
					array[j+1] = array[j];
				}
				else {
					break;
				}
			}
			array[j+1] = value;
		}
	}

}
