package com.chapter40;

/**
 * 动态规划求解背包问题
 * @author 杨帆
 */
public class Dynamic02 {

	/**
	 * 用二维数组实现的版本
	 * @param weight
	 * @param w
	 * @return
	 */
	static int func(int weight[], int w) {
		
		int[][] states = new int[weight.length][w + 1];
		// 第一个物品不要
		states[0][0] = 1;
		// 第一个物品要
		states[0][weight[0]] = 1;
		
		for(int i = 1; i < weight.length; i++) {
			for(int j = 0; j < w + 1; j++) {
				if(states[i - 1][j] == 1) {
					// 不要这个物品
					states[i][j] = 1;
					// 要这个物品
					if(j + weight[i] <= w) {
						states[i][j + weight[i]] = 1;
					}
				}
			}
		}
		
		// 打印二维数组
		for(int i = 0; i < weight.length; i++) {
			for(int j = 0; j < w + 1; j++) {
				System.out.print(states[i][j] + " ");
			}
			System.out.println();
		}
		
		// 输出结果
		for(int j = w; j >= 0; j--) {
			for(int i = 0; i < weight.length; i++) {
				if(states[i][j] == 1) {
					return j;
				}
			}
		}
		return 0;
	}
	
	/**
	 * 一维数组实现版本
	 * @param weight
	 * @param w
	 * @return
	 */
	static int func2(int[] weight, int w) {
		boolean[] states = new boolean[w + 1];
		states[0] = true;
		states[weight[0]] = true;
		
		for(int i = 1; i < weight.length; i++) {
			// 这里要从尾开始计算，否则会存在重复计算的bug
			for(int j = w - weight[i]; j >= 0; j--) {
				if(states[j]) {
					states[j + weight[i]] = true;
				}
			}
		}
		
		for(int i = w; i >= 0; i--) {
			if(states[i]) {
				return i;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int[] weight = {3, 3, 3, 3, 3};
		int w = 10;
		System.out.println(func2(weight, w));
	}
}
