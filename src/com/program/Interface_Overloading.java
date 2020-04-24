package com.program;

interface myinterface{
	void m1();
	void m1(String input);
}



public class Interface_Overloading implements myinterface {

	public static void main(String[] args) {
		Interface_Overloading obj=new Interface_Overloading();
		obj.m1();
		obj.m1("Test");
	
	}

	@Override
	public void m1() {
		System.out.println("m1 without String");
	}

	@Override
	public void m1(String input) {
		System.out.println("m1 with String");
	}

}

/*Output
m1 without String
m1 with String
*/