package com.zjlolife.algorithm.search;

public class BinarySearch {


	/**
	 * 找到给定值的数据，数组里各个元素均不会重复
	 * [1, 9, 20, 44, 55, 100, 230]
	 * @return
	 */
	public static int findEqualNum(int [] a, int value) {
		int low = 0;
		int high = a.length-1;
		for (;;) {
			if (high < low) {
				break;
			}
			int mid = (high + low) / 2;
			if (a[mid] > value) {
				high = mid - 1;
			}
			else if (a[mid] < value) {
				low = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

	/**
	 * 查找第一个等于value的值
	 * [1, 4, 5, 7, 20, 44, 44, 55, 230]
	 * [1, 4, 11, 11, 20, 34, 44, 55, 230]
	 * [1, 4, 11, 11, 11, 34, 44, 55, 230]
	 * @param a
	 * @param value
	 * @return
	 */
	public static int findFirstEqualNum(int [] a, int value) {

		int low = 0;
		int high = a.length-1;

		for(;;) {
			if (high < low) {
				break;
			}
			if (high == low && a[low] == value) {
				return low;
			}
			int mid = (high + low) / 2;
			if (a[mid] < value) {
				low = mid + 1;
			} else if (a[mid] > value) {
				high = mid - 1;
			} else {
				high = mid;
			}
		}
		return -1;
	}

	/**
	 * 查找最后一个数等于value的值
	 * [1, 4, 5, 7, 20, 44, 44, 55, 230]
	 * [1, 4, 11, 11, 20, 34, 44, 55, 230]
	 * [1, 4, 11, 11, 11, 34, 44, 55, 230]
	 * @param a
	 * @param value
	 * @return
	 */
	public static int findEndEqualNum(int [] a, int value) {

		int low = 0;
		int high = a.length-1;

		for(;;) {
			if (high < low) {
				break;
			}
			if (high == low && a[low] == value) {
				return low;
			}
			int mid = (high + low) / 2;
			if (a[mid] < value) {
				low = mid + 1;
			} else if (a[mid] > value) {
				high = mid - 1;
			} else {
				low = mid;
			}
		}
		return -1;
	}

	/**
	 * 查找第一个大于等于value的值
	 * [1, 4, 5, 7, 20, 44, 44, 55, 230]
	 * @param a
	 * @param value
	 * @return
	 */
	public static int findFirstGtEqualNum(int [] a, int value) {

		int low = 0;
		int high = a.length-1;
		for (;;) {
			if (high < low) {
				break;
			}
			if (high == low && a[low] == value) {
				return low;
			}
			int mid = (high + low) / 2;
			if (a[mid] >= value) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	/**
	 * 查找最后一个小于等于value的值
	 * [1, 4, 5, 7, 20, 44, 44, 55, 230]
	 * @param a
	 * @param value
	 * @return
	 */
	public static int findEndLtEqualNum(int [] a, int value) {

		int low = 0;
		int high = a.length-1;
		for (;;) {
			if (high < low) {
				break;
			}
			if (high == low && a[low] == value) {
				return low;
			}
			int mid = (high + low) / 2 + 1; //采用下中位 防止当剩下两个数字的时候出现死循环

			if (a[mid] > value) {
				high = mid - 1;
			}
			else {
				low = mid; //限定范围,当a[mid] <= value时，这个目标值肯定mid或者mid之后
			}
		}
		return -1;
	}
}
