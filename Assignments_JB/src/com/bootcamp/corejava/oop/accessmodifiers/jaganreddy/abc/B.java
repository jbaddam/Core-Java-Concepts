package com.bootcamp.corejava.oop.accessmodifiers.jaganreddy.abc;

/**
 * @author Jagan Reddy
 *
 */
public class B extends A{
	
	/*
	 * We can't access private variable "j" out side the class A
	 */
	public  int add(){
		 	
		 int sum = i+k+l;//public i, default k,protected  l
		 return sum;
		 
	 }

}
