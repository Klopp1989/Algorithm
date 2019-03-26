package com.chapter40;

/**
 * 回溯法求解背包问题
 * 背包问题：背包最大承重为9，有一堆物品如weight如示，问这时背包最多能承受多重
 * @author 杨帆
 *
 */
public class Dynamic01 {

	static int max = 0;
//	static int[] weight = {2, 2, 4, 6, 3};
	static int[] weight = {3, 3, 3, 3, 3};
	static int w = 10;
	
	public static void func(int i, int cw) {
		// 终止条件
		if(cw == w || i == weight.length) {
			if(cw > max) {
				max = w;
			}
			return;
		}
		
		// 不放第i个
		func(i + 1, cw);
		
		// 放第i个
		if(cw + weight[i] <= w) {
			func(i + 1, cw + weight[i]);
		}
	}
	
	public static void main(String[] args) {
		func(0, 0);
		System.out.println(max);
	}
}
