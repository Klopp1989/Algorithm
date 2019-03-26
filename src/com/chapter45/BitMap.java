package com.chapter45;

/**
 * 利用位图实现类似于布隆过滤器功能
 * @author YangFan
 */
public class BitMap {

	private int len;
	private char[] bytes;
	
	public BitMap(int len) {
		this.len = len;
		this.bytes = new char[len / 8 + 1];
	}
	
	/**
	 * 通过位运算，将数据放二进制位中
	 * java中一个字节的数据类型byte和char，在初始时，8个bit不全是0。无法实现函数中设想的这种场景
	 * @param n
	 */
	public void set(int n) {
		if(n > len) {
			return;
		}
		int bytesIndex = len / 8;
		int bitIndex = len % 8;
		bytes[bytesIndex] |= 0b1 << bitIndex;
	}
	
	public boolean get(int n) {
		if(n > len) {
			return false;
		}
		int bytesIndex = len / 8;
		int bitIndex = len % 8;
		return (bytes[bytesIndex] & (1 << bitIndex)) != 0;
	}
	
	public void printBytes() {
		for(char b : bytes) {
			String s = Integer.toBinaryString(b);
			int i = 8 - s.length();
			while(i > 0) {
				s = "0" + s;
				i--;
			}
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		BitMap bm = new BitMap(13);
		bm.set(12);
		System.out.println(bm.get(12));
		System.out.println(bm.get(13));
		bm.printBytes();
	}
	
	
}
