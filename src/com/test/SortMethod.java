package com.test;

/**
 * 排序方法：
 * 
 * @author Administrator
 *
 */
public class SortMethod {

	/**
	 * 工具方法：交换数组中的两个值
	 */
	public static void swap(int[] sqList, int i, int j) {
		int temp = sqList[i];
		sqList[i] = sqList[j];
		sqList[j] = temp;
	}

	/**
	 * 工具方法：遍历数组
	 */
	public static void arrayPrint(int[] sqList) {
		for (int i = 0; i < sqList.length; i++) {
			System.out.print(sqList[i] + ",");
		}
		System.out.println();
	}

	/**
	 * 冒泡排序：初级版
	 */
	public static int[] bubbleSort1(int[] sqList) {
		for (int i = 0; i < sqList.length; i++) {
			for (int j = i + 1; j < sqList.length; j++) {
				if (sqList[i] > sqList[j]) {
					swap(sqList, i, j);
				}
			}
		}
		return sqList;
	}

	/**
	 * 冒泡排序：正宗版 ???
	 */
	public static int[] bubbleSort2(int[] sqList) {
		for (int i = 0; i < sqList.length - 1; i++) {
			for (int j = sqList.length - 2; j >= i; j--) {
				if (sqList[j] > sqList[j + 1]) {
					swap(sqList, i, j);
				}
			}
			arrayPrint(sqList);
		}
		return sqList;
	}

	/**
	 * 冒泡排序：改进版
	 * ???
	 */
	public static int[] bubbleSort3(int[] sqList) {
		boolean flag = true;
		for (int i = 0; i < sqList.length && flag; i++) {
			flag = false;
			for (int j = sqList.length - 1; j >= i; j--) {
				if (sqList[j] < sqList[j + 1]) {
					swap(sqList, i, j);
					flag = true;
				}
			}
		}
		return sqList;
	}

	public static void main(String[] args) {
		int[] s = { 9, 1, 5, 8, 3, 7, 4, 6, 2 };
		System.out.println("排序前的数组：");
		arrayPrint(s);
		System.out.println("排序后的数组：");
		long startDate = System.nanoTime();
		int[] sqList = bubbleSort3(s);
		long endDate = System.nanoTime();
		arrayPrint(sqList);
		System.out.println("所用时间(毫微秒)：" + (endDate - startDate));
		System.out.println("-------------------");
	}

}
