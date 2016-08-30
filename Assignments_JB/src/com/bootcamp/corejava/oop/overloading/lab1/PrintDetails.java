package com.bootcamp.corejava.oop.overloading.lab1;


/**
 * @author Jagan Reddy
 * PrintDetails  class has overloaded method printHeader
 */
public class PrintDetails {
	
	public void printHeader(char c){
		
		for(int i =0 ;i < 80; i++){
			System.out.print(c+" ");
		}
		System.out.println();
	}
	public void printHeader(char c, int no){
		
		for(int i =0 ;i < no; i++){
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	public void printHeader(String s){
		System.out.println(s);
	}

}
