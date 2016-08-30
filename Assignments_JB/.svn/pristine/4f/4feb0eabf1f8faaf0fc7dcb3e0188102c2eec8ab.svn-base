package com.bootcamp.corejava.oop.inheritance.lab3;


/**
 * @author Jagan Reddy
 * class MonsterTruck extending Truck
 */
public class MonsterTruck extends Truck {
	
	public void m1() {
        System.out.println("Monster 1");
    }
     
    public void m2() {
    	super.m1();
        super.m2();
    }
     
    public String toString() {
        return "monster " + super.toString();
    }
    
    public static void main(String[] args) {
    	MonsterTruck mt = new MonsterTruck();
    	mt.m1();
    	mt.m2();
    	System.out.println(mt.toString());
    	
	}

}
