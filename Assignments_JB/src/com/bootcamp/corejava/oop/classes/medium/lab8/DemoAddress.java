package com.bootcamp.corejava.oop.classes.medium.lab8;


/**
 * @author Jagan Reddy
 *
 */
public class DemoAddress {

	public static void main(String[] args) {
		Address address = new Address();
				
		address.setAddressLine("8231 Ranchview  Dr");
		address.setCity("Irving");
		address.setZip("75063");
		address.setState("Texas");
		
		System.out.println("Address \nStreet=" + address.getAddressLine() + 
				"\ncity=" + address.getCity() + 
				"\nzip=" + address.getZip() + 
				"\nstate=" + address.getState()) ;

	}
}
