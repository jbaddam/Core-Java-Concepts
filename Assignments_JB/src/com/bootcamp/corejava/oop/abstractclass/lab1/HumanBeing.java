package com.bootcamp.corejava.oop.abstractclass.lab1;

/**
 * @author Jagan Reddy
 *
 */
public class HumanBeing extends LandMammal {

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Humanbeing Walking");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Humanbeing Running");
	}

	@Override
	void crawl() {
		// TODO Auto-generated method stub
		System.out.println("Humanbeing Crawling");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Humanbeing Eating");
	}
	
	public void think(){
		System.out.println("Humanbeing Thinking");
	}

}
