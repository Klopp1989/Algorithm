package com.chapter11;

import com.util.StringUtil;

/**
 * 选择排序
 *
 * @author 杨帆
 */
public class SelectSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 找最小值
            int tmp = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < tmp) {
                    tmp = arr[j];
                    index = j;
                }
            }

            // 交换
            int tmp2 = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 3, 2};
        sort(arr);
        StringUtil.arr2string(arr);
    }
}
