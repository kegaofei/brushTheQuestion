package com.lintcode;

/**
 *  A + B
 * @author mukegaofei
 */
public class APlusB {

	public static void main(String[] args) {
		int a = -15;
		int b = 33;
		
		System.out.println(APlusB.addition(a, b));
		System.out.println(APlusB.additionBit(a, b));
	}
	
	public static int addition(int a, int b) {
		return a + b;
	}

	public static int additionBit(int a, int b) {
		if(b == 0)
			return a;
		return additionBit(a ^ b, (a & b) << 1);
	}
	
}
