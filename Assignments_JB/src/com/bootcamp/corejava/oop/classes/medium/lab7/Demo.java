package com.bootcamp.corejava.oop.classes.medium.lab7;


/**
 * @author Jagan Reddy
 *
 */
public class Demo {

	
	public static void main(String[] args) {
		Traveller traveller = new Traveller();
		Check cheks = new Check();
		
		traveller.setTravellerId(1001);
		traveller.setBaggageAmount(35);
		traveller.setExpiryYear(2019);
		traveller.setNocStatus(true);
		
		if(cheks.checkBaggage(traveller) && cheks.checkImmigration(traveller) 
				&& cheks.checkSecurity(traveller)){
			System.out.println("Allow Traveller to fly!");
		}else
			System.out.println("Detain Traveller for Re-checking!");
		

	}
}
