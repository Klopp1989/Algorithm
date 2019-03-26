package com.chapter11;

import com.util.StringUtil;

public class InsertSort {

	/**
	 * 自己发挥写的
	 * @param arr
	 * @return
	 */
	public static int[] sort(int[] arr) {
		int[] narr = new int[arr.length];
		narr[0] = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			int index = i;
			for(int j = 0; j < i; j++) {
				// 找到插入位置
				if(arr[i] < narr[j]) {
					index = j;
					break;
				}
			}
			
			// 元素后移
			for(int k = i; k > index; k--) {
				narr[k] = narr[k - 1];
			}
			narr[index] = arr[i];
		}
		return narr;
	}
	
	/**
	 * 官方代码
	 * @param arr
	 */
	public static void sort2(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				} else {
					break;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 1, 3, 2};
		sort2(arr);
		StringUtil.arr2string(arr);
	}
}
