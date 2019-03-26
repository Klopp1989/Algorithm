package com.chapter45;

public class Test {

	public static void main(String[] args) {
		
		byte b = 8;
		
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(1 << 2));
		
		b |= 1 << 6;
		
		System.out.println(Integer.toBinaryString(b));
		
	}
}
