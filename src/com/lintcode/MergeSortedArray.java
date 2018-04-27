package com.lintcode;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] A= {1,2,3,4};
		int[] B= {2,4,5,6};
		MergeSortedArray.mergeSortedArray(A, B);
	}

	/**
	 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
　　Object src : 原数组
   		int srcPos : 从元数据的起始位置开始
　　Object dest : 目标数组
　　int destPos : 目标数组的开始起始位置
　　int length  : 要copy的数组的长度
	 * @param A
	 * @param B
	 * @return
	 */
	public static int[] mergeSortedArray(int[] A, int[] B) {
		//arrayCopy( arr1, 2, arr2, 5, 10);
		//意思是;将arr1数组里从索引为2的元素开始, 复制到数组arr2里的索引为5的位置, 复制的元素个数为10个. 
		int[] AB = new int[A.length + B.length];
		System.arraycopy(A, 0, AB, 0, A.length);
		System.arraycopy(B, 0, AB, A.length, B.length);
		Arrays.sort(AB);
		return AB;
    }
	
}
