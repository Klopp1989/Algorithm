package com.chapter11;

import com.util.StringUtil;

/**
 * 冒泡排序
 * @author 杨帆
 */
public class BubbleSort {
	
	public static void sort(int[] arr) {
		
		if(arr == null || arr.length < 2) {
			return;
		}
		
		for(int j = 0; j < arr.length; j++) {
			boolean flag = true;
			for(int i = 1; i < arr.length - j; i++) {
				if(arr[i - 1] > arr[i]) {
					// 交换位置
					int tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;	
					flag = false;
				}
			}
			StringUtil.arr2string(arr);
			
			if(flag == true) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 6, 5, 4};
		sort(arr);
		StringUtil.arr2string(arr);
	}
}
