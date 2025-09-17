package com.tnsif.accessmodifierprogram;

public class Publicdemo {
public int a=9;   // data memebr
	
	public String name="reva";
	
	public float s=9.5f;
	
	int u=92;
	
	public void display() {  // method
		System.out.println("welcome");
	}
	
public static void main(String[] args) {
	Publicdemo p=new Publicdemo();
	
	System.out.println(p.name);
	
	System.out.println(p.a);
	
	System.out.println(p.s);
	
	System.out.println(p.u);
	
	p.display();
}


}
