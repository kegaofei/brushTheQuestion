package com.lintcode;
/**
 * 计算n阶乘结果中后面0的个数
 * @author mukegaofei
 */
public class TrailingZeros {

	public static void main(String[] args) {
		
		System.out.println(TrailingZeros.trailingZeros(11));
		
	}
	
	public static long trailingZeros(long n) {
		long count = 0;
        for(long i = 5; n/i >= 1; i *= 5){
            count += n/i;
        }
        return count;
	}

}
