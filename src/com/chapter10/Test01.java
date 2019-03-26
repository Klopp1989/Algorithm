package com.chapter10;

/**
 * 一个台阶有7步，每步能走1或2个台阶，问有多少种走法
 * @author 杨帆
 */
public class Test01 {

	/**
	 * 递归走法
	 * @param n
	 * @return
	 */
	public static int count(int n) {
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		return count(n - 1) + count(n - 2);
	}
	
	/**
	 * 非递归算法
	 * @param n
	 * @return
	 */
	public static int count2(int n) {
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		
		int ret = 0;
		int pre = 2;
		int prepre = 1;
		for(int i = 3; i <= n; i++) {
			ret = pre + prepre;
			
			prepre = pre;
			pre = ret;
		}
		
		return ret;
	}
	
	
	public static void main(String[] args) {
		System.out.println(count(7));
		System.out.println(count2(7));
	}
}
