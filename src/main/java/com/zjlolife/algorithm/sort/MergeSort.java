package com.zjlolife.algorithm.sort;

public class MergeSort {

	public static void main(String [] args) {
		int [] array = new int[]{1, 4, 10, 20, 2, 14, 33, 56, 22};
		mergeSort(array, 0, 8);
		print(array);
		//merge(new int[] {1, 4, 10, 20, 21, 14, 33, 56, 22}, 2, 4, 7);
	}

	public static void mergeSort(int [] array, int start, int end) {
		if (start == end) {
			return;
		}

		//找到中间点
		int p = (end + start) / 2; //0-p, p-n-1
		mergeSort(array, start, p);
		mergeSort(array, p+1, end);

		//再两者合并
		merge(array, start, p, end);
	}

	public static void merge(int [] array, int start, int p, int end) {
		int [] tmp = new int[end - start + 1];
		int i = start;
		int j = p+1;
		int k=0;
		for (; k<tmp.length;) {
			if (i > p || j > end) {
				break;
			}
			if (array[i] >= array[j]) {
				tmp[k++] = array[j];
				j++;
			}
			else {
				tmp[k++] = array[i];
				i++;
			}
		}

		int m = 0;
		if (i > p) {
			m = j;
		}
		else {
			m = i;
		}

		for (int q=k; q<tmp.length; q++) {
			tmp[q] = array[m];
			m++;
		}

		for (int s=0; s<tmp.length; s++) {
			array[s + start] = tmp[s];
		}
	}

	public static void print(int[] array) {
		for (int a : array) {
			System.out.print(a + ",");
		}
		System.out.println("");
	}

}
