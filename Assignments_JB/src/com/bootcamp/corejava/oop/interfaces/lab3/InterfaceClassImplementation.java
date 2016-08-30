package com.bootcamp.corejava.oop.interfaces.lab3;

/**
 * @author Jagan Reddy
 *
 */
public class InterfaceClassImplementation {

	public static void main(String[] args) {
		
		//Creating object  for lion class using Mammal abstract grand parent class reference and calling the available methods
		Mammal m = new Lion();
		m.eat();
		
		 
		//Creating object for lion class using LandMammal abstract  parent class reference and calling the available methods
		LandMammal lm = new Lion();
		lm.eat();
		lm.crawl();
		lm.run();
		
		//Creating object for lion class using Lion class reference itself and calling the available methods
		Lion lion = new Lion();
		lion.crawl();
		lion.eat();
		lion.run();
		lion.roar();
		
		
		
		System.out.println("\nLion execution completed\n\n");
		
		
		//Creating object  for HumanBeing class using Mammal grand parent interface reference and calling the available methods
				Mammal mHumanbeing = new HumanBeing();
				mHumanbeing.eat();
				 
				//Creating object for HumanBeing class using LandMammal  parent interface reference and calling the available methods
				LandMammal lmHumanbeing = new HumanBeing();
				lmHumanbeing.eat();
				lmHumanbeing.crawl();
				lmHumanbeing.run();
				
				
				//Creating object for HumanBeing class using HumanBeing class itself reference and calling the available methods
				HumanBeing humnabeing = new HumanBeing();
				humnabeing.crawl();
				humnabeing.eat();
				humnabeing.run();
				humnabeing.think();
				
				
				System.out.println("\nHumanBeing execution completed\n\n");
				
								//Creating object  for Whale class using Mammal grand parent interface reference and calling the available methods
								Mammal mwhale = new Whale();
								mwhale.eat();
								 
								//Creating object for Whale class using WaterMammal  parent interface reference and calling the available methods
								WaterMammal wmWhale = new Whale();
								wmWhale.eat();
								wmWhale.swim();
								
								
								//Creating object for Whale class using Whale class reference itself and calling the available methods
								Whale whale = new Whale();								
								whale.eat();
								whale.swim();
								whale.dive();
								
				System.out.println("\nWhale execution completed\n\n");				
		
		
		

	}

}
