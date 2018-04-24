package com.other;

import java.util.Stack;

/**
 * 字符反转显示
 * @author mukegaofei
 */
public class StringReversal {

	public static void main(String[] args) {
		String str = "mukegaofei";
		System.out.println(StringReversal.reversalShow(str));
	}
	
	public static String reversalShow(String str) {
		
		int length = str.length();
		Stack<Object> stack = new Stack<>();
		
		for(int i=0; i<length; i++) {
			stack.push(str.charAt(i));
		}
		
		String returnStr = "";
		for(int i=0; i<length; i++) {
			returnStr += stack.pop().toString();
		}
		
		return returnStr;
	}

}
