package com.program;

public class CheckPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("LiveLong"));

	}
	public static boolean isPalindrome(String input) {
		String str=new StringBuilder(input).reverse().toString();
		return input.equalsIgnoreCase(str);
	}
}

/*
 * OUTPUT
 *  true 
 *  false
 */