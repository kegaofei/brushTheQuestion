package com.lintcode;

import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] array = {6,3,7,2,3,9,11,4,8};
		System.out.println(KthLargestElement.kthLargestElement(array, 1));
	}
	
	public static int kthLargestElement(int[] array, int k) {
		Arrays.sort(array);
		return array[array.length-1];
	}

}
