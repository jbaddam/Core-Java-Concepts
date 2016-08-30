package com.bootcamp.corejava.oop.classes.medium.lab7;


/**
 * @author Jagan Reddy
 * This class has a functionality to check immigration status 
 * security check and baggage check of a traveler
 */
public class Check {
	

	/**
	 * @param traveler
	 * @return
	 * this methods checks the traveler baggage
	 */
	public boolean checkBaggage(Traveller traveller){
		
		if(traveller.getBaggageAmount()>=0 && traveller.getBaggageAmount()<=40){
			return true;
		}else
		return false;
	}
	
	/**
	 * @param traveler
	 * @return
	 * this methods performs Immigration check on traveler 
	 */
    public boolean checkImmigration(Traveller traveller){
		
    	if(traveller.getExpiryYear()>=2001 && traveller.getExpiryYear()<=2025 ){
			return true;
		}else
		return false;
	}   

    /**
	 * @param traveller
	 * @return
	 * this methods performs Security check on traveler 
	 */
      public boolean checkSecurity(Traveller traveller){
	
    	if(traveller.isNocStatus() ){
			return true;
		}else
		return false;
}

}
