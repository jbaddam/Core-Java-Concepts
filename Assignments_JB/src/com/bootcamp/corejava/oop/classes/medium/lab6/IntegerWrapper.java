package com.bootcamp.corejava.oop.classes.medium.lab6;


/**
 * @author Jagan Reddy
 * This class has a functionality to swap the properties of two objects
 */
public class IntegerWrapper {
	 private int a;
	  public IntegerWrapper(int a) {
		  this.a = a; 
		  }
	
	/**
	 * @param obj
	 * This method will swap the properties of other object by using current class object
	 */
	public void swap(Object obj ){
		  
		  IntegerWrapper iw = (IntegerWrapper)obj;
		  
		  int temp = iw.a;		  
		  iw.a = a;		  
		  a = temp;		  		  
	  }
	  
	  public static void main(String[] args) {
		
		  IntegerWrapper integerOne = new IntegerWrapper(10);
		  IntegerWrapper integerTwo = new IntegerWrapper(15);
		  
		  System.out.println("object 1 properties before swap : "+integerOne.a);
		  System.out.println("object 2 properties before swap : "+integerTwo.a);
		  
		  integerOne.swap(integerTwo);
		  
		  System.out.println("\n\nobject 1 properties after swap : "+integerOne.a);
		  System.out.println("object 2 properties after swap : "+integerTwo.a);
		  
	}

}
