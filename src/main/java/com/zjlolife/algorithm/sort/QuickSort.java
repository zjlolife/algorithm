package com.zjlolife.algorithm.sort;

/**
 * 快速排序关键点 在于 分区函数， 这里取数组的最后一个数为分区数，左边的为小于分区数的，右边的是大于等于的分区数的
 *
 * [1, 9, 3, 8, 0] 从一开始都是未处理区间 [i, q-1] (i=0, q = array.length), 将未处理区间的元素一个个与分区元素比较，发现比分区数字
 * 小，则与第i个位置交换，并将i++; 这样就有已处理区间，和未处理区间；已处理区间为小于分区元素的，未处理区间为大于等于的，最后将swap[q & i]
 */
public class QuickSort {

	public static void main(String [] args) {
		int [] array = new int[] {4,2, 10, 1, 233, 98};
		quickSort(array, 0, array.length - 1);
		print(array);
	}

	public static void quickSort(int[] array, int p, int q) {

		if (p == q) {
			return;
		}
		int partition = partition(array, p , q);

		if (p <= partition -1) {
			quickSort(array, p, partition-1);
		}
		if (q >= partition+1) {
			quickSort(array, partition+1, q);
		}
	}

	public static int partition(int [] array, int p, int q) {
		//每次选择最后一个数，将大于这个数的放在右边，小于这个数的放在左边
		int r = q;

		int i=p;  //从一开始都是未处理区间 i -> r-1  [0, r-1]
		int partitionNum = array[r];
		for (int j=p; j<=r-1; j++) {
			if (array[j] < partitionNum) {
				int tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;
				i++;
			}
		}
		int tmp = array[i];
		array[i] = array[r];
		array[r] = tmp;

		return i;
	}

	public static void print(int[] array) {
		for (int a : array) {
			System.out.print(a + ",");
		}
		System.out.println("");
	}

}
