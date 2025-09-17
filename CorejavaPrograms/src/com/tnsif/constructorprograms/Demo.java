package com.tnsif.constructorprograms;

public class Demo {
	Demo() {
		System.out.println("Welcome");
	}
	Demo(int a) {
		System.out.println("Hi");
	}
	Demo(int a, String b) {
		System.out.println("to");
	}
	Demo (int a, String b, String c) {
		System.out.println("Reva University");
	}
	public static void main(String[] args)	
	 {
		Demo d1=new Demo(2);
		Demo d2=new Demo();
		Demo d3=new Demo(1,"Hello");
		Demo d4=new Demo(3,"to","Hi");
	}
	
}
