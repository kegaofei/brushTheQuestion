package com.lintcode;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		RotateString.rotateString(str, 0);
	}
	
	/**
		offset=0 => "abcdefg"
		offset=1 => "gabcdef"
		offset=2 => "fgabcde"
		offset=3 => "efgabcd"
	 * @param str
	 * @param offset
	 */
	public static void rotateString(char[] str, int offset) {
		//arrayCopy( arr1, 2, arr2, 5, 10);
		//意思是;将arr1数组里从索引为2的元素开始, 复制到数组arr2里的索引为5的位置, 复制的元素个数为10个. 
    }

}
