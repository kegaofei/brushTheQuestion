package com.lintcode;

/**
 * 	if n = 12, k = 1 in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] we have FIVE 1`s (1, 10, 11, 12)
 * @author mukegaofei
 */
public class DigitCounts {
	private static int sum = 0;
	public static void main(String[] args) {
		
		int n = 12;
		int k = 1;
		
		int sum = DigitCounts.digitCount(n, k);
		System.out.println(sum);
	}
	
	public static int stringNumbers(String str, String s) {
		if(str.indexOf(s) ==  -1) {
			return 0;
		}else if(str.indexOf(s) != -1) {
			sum++;
			stringNumbers(str.substring(str.indexOf(s) + 1), s);
			return sum;
		}
		return 0;
	}
	public static int digitCount(int n, int k) {
		
		String kStr = String.valueOf(k);
		
		String[] digitArray = new String[n + 1];
		for(int i=0; i<=digitArray.length-1; i++) {
			digitArray[i] = String.valueOf(i);
		}
		
		for(int i=0; i<digitArray.length; i++) {
			stringNumbers(digitArray[i], kStr);
		}
			
		return sum;
	}
	
}
