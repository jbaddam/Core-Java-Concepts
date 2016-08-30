package com.bootcamp.corejava.oop.abstractclass.lab1;

/**
 * @author Jagan Reddy
 *
 */
public class Lion extends LandMammal {

	@Override
	void walk() {
		
		System.out.println("Loin Walking");
	}

	@Override
	void run() {
		
		System.out.println("Loin Running");
	}

	@Override
	void crawl() {
		
		System.out.println("Lion Crawling");
	}

	@Override
	void eat() {
		
		System.out.println("Lion eating");
	}
	
	public void roar(){
		System.out.println("Lion Roaring");
	}

}
