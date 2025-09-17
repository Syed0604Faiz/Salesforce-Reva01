package com.tnsif.scanner;

import java.util.Scanner;

public class Maindemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the income");
		int income=sc.nextInt();
		xxxxxxxxxxxx
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalulation t=new Taxcalulation ();
		t.calculatetax(pp);
		
		System.out.println("after tax calculation");
		System.out.println(pp);
		
	}

}
