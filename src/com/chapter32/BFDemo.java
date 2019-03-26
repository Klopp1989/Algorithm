package com.chapter32;

/**
 * BF算法实现字符串indexOf功能
 * @author 杨帆
 */
public class BFDemo {

	public static int func(String main, String mode) {
		if(main == null || "".equals(main) || mode == null || "".equals(mode) || main.length() < mode.length()) {
			return -1;
		}
		char[] mainArr = main.toCharArray();
		char[] modeArr = mode.toCharArray();

		
		for(int i = 0; i <= mainArr.length - modeArr.length; i++) {
			boolean f = true;
			for(int j = 0; j < modeArr.length; j++) {
				if(mainArr[i + j] != modeArr[j]) {
					f = false;
					break;
				}
			}
			if(f) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	/**
	 * 二维字符数组的indexOf
	 * @param main
	 * @param mode
	 * @return
	 */
	public static int[] func2(char[][] main, char[][] mode) {
		int[] rel = {-1, -1};
		if(main == null || mode == null || main.length < 1 || mode.length < 1 || main.length < mode.length || main[0].length < mode[0].length) {
			return rel;
		}
		
		for(int i = 0; i <= main.length - mode.length; i++) {
			for(int j = 0; j < mode[0].length; j++) {
				
				
				
				
			}
		}
		
		return rel;
	}
	
	
	public static void main(String[] args) {
		//String main = "aaaaabc";
		//String mode = "abc";
		//System.out.println(func(main, mode));
		
		char[][] main = new char[4][5];
		main[0][0] = 'c';
		main[0][1] = 'a';
		main[0][2] = 'b';
		main[0][3] = 'c';
		main[1][0] = 'e';
		main[1][1] = 'f';
		main[1][2] = 'a';
		main[1][3] = 'd';
		main[2][0] = 'c';
		main[2][1] = 'c';
		main[2][2] = 'a';
		main[2][3] = 'f';
		main[3][0] = 'd';
		main[3][1] = 'e';
		main[3][2] = 'f';
		main[3][3] = 'c';
		
		char[][] mode = new char[2][2];
		mode[0][0] = 'c';
		mode[0][1] = 'a';
		mode[1][0] = 'e';
		mode[1][1] = 'f';
		
		
		System.out.println(main.length);
		//main[0] = {'a', 'b', 'b', 'b', 'b'};
		
		
	}
}
