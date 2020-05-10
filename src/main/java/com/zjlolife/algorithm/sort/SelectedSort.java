package com.zjlolife.algorithm.sort;

public class SelectedSort {

	public static void main(String [] args) {
		selectedSort(new int[]{5, 7, 2, 0, -1, 10, 2});
	}

	public static void selectedSort(int[] array) {
		int n = array.length;
		for (int i=0; i<n; i++) {

			int minIndex = i;
			for (int j=i+1; j<n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			//i 和 minIndex互换
			int tmp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tmp;
		}
		print(array);
	}

	public static void print(int[] array) {
		for (int a : array) {
			System.out.print(a + ",");
		}
		System.out.println("");
	}
}
