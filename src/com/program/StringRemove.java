package com.program;

public class StringRemove {
public static void main(String[] args) {
	String str ="REST ASSURED";
	System.out.println(str);
	str=str.replaceAll("ST", "");
	System.out.println(str);
}
}


/*
 * OUTPUT 
 * REST ASSURED
 *  RE ASSURED
 */