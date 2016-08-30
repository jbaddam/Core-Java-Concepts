package com.bootcamp.corejava.oop.classes.medium.lab1;


/**
 * @author Jagan Reddy
 * This class has a functionality to calculate invoice amount
 */
public class Invoice {
	
private String partNumber;
private String partDescription;
private int quantity;
private double price;

/** Parameterized constructor
 * @param partNumber
 * @param partDescription
 * @param quantity
 * @param price
 */
public Invoice() {
	super();
	this.partNumber = "Spa123";
	this.partDescription = "Wheel Spanner";
	this.quantity = 1;
	this.price = 0.0;
}


public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}


public void setPartDescription(String partDescription) {
	this.partDescription = partDescription;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public void setPrice(double price) {
	this.price = price;
}


public String getPartNumber() {
	return partNumber;
}

public String getPartDescription() {
	return partDescription;
}

public int getQuantity() {
	return quantity;
}

public double getPrice() {
	return price;
}

/**This method calculate the invoice amount 
 * @return totalAmount
 */
public double getInvoiceAmount() {
	
	
	if(getQuantity()>0){
	double totalAmount=getQuantity()*getPrice();	
    return totalAmount;
	}
	
	else
		return 0.0;
}

}
