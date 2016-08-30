package com.bootcamp.corejava.oop.abstractclass.lab1;

/**
 * @author Jagan Reddy
 *
 */
public class Whale extends WaterMammal {

	@Override
	void swim() {
		// TODO Auto-generated method stub
		System.out.println("Whale Swimming");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Whale Eating");
	}
	
	public void dive(){
		
		System.out.println("Whale diving");
	}

}
