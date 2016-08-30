package com.bootcamp.corejava.oop.accessmodifiers.jaganreddy.abc;

/**
 * @author Jagan Reddy
 *
 */
public class C {
	
	
	B b = new B();
	/*
	 * We can't access private variable "b.j" out side the class
	 */
	public  int add(){		 
		 int sum = b.i+b.k+b.l;
		 return sum;
		 
	 }

}
