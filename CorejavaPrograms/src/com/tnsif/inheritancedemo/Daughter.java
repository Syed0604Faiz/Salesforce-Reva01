
package com.tnsif.inheritancedemo;

public class Daughter extends Father {
String cycle="green";
	
	public static void main(String[] args) {
		Daughter d = new Daughter();
		
		System.out.println(d.car);
		System.out.println(d.money);
		System.out.println(d.cycle);
		
		d.drinking();
		d.reading();

}
}
