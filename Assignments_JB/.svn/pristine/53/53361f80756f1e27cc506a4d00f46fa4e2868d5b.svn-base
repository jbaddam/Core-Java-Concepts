package com.bootcamp.corejava.oop.classes.medium.lab5;

/**
 * @author Jagan Reddy
 * This class has functionality to find distance from another point,
 * slope with another point, midPoint , isCollinear ,distance from origin 
 */
public class Point {
	
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	/**
	 * @param temp
	 * @return
	 * This Method will distance of the given point from another point
	 */
	public int distanceFromAnotherPoint(int[] temp ){
		
		int[] point1 = new int[2];
		point1[0] = getX();
		point1[1] = getY();
		
         
		int dist = 0;
		
		dist =  (int)Math.sqrt((point1[0]-temp[0])*(point1[0]-temp[0]))+((point1[1]-temp[1])*(point1[1]-temp[1]));
		
		return dist;
	}
	
	
	/**
	 * @param temp
	 * @return
	 * This method will return the slope between 2 points
	 */
	public int slopeWithAnotherPoint(int[] temp){
		
		int[] point1 = new int[2];
		point1[0] = getX();
		point1[1] = getY();
		
		int slope = (int)(point1[1] - temp[1])/point1[0] - temp[0];
		
		return slope;
	}
	
	
	/**
	 * @param temp
	 * @param temp1
	 * @return
	 * this method return true if the points are collinear else returns false
	 */
	public boolean isCollinear(int[] temp,int[] temp1) {
		
		int[] point1 = new int[2];
		
		point1[0] = getX();
		point1[1] = getY();
			
		int slope1 = (point1[1] - temp[1])/(point1[0] - temp[0]);
			
		int slope2 = (point1[1] - temp1[1])/(point1[0] - temp1[0]);
		
		int slope3 = (temp1[1] - temp[1]) / (temp1[0] - temp[0]);
		
		if ((slope1 == slope2) && (slope2 == slope3)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * @param temp
	 * @return
	 * This method will returns midpoint of 2 given two points
	 */
	public int[] midPoint(int[] temp ) {
		
		int[] point1 = new int[2];
		point1[0] = getX();
		point1[1] = getY();
		
		int[] midpoint = new int[2];
		 midpoint[0] = (int) ((point1[0] + temp[0])/2);
		 midpoint[1] = (int) ((point1[1] + temp[1])/2);
		return midpoint;
	}
	
	/**
	 * @return
	 * This method will return  the midpoint from origin
	 */
	public int distanceFromOrigin(){
		
		int dist =  (int)Math.sqrt((getX()*getX())+(getY()*getY()));
		
		return dist;
	
	}
	
	/**
	 * @return
	 * This method returns true if the point is vertical else returns false
	 */
	public boolean isVertical(){
		
		boolean value = false;
		
		if (getX() == 0){
			
			value = true;
		}
		
		return value;
	}
	
	
	/**
	 * @return
	 * This method returns true if the point is Horizontal else returns false
	 */
	public boolean isHorizontal(){
		
		boolean value = false;
		
		if (getY() == 0){
			
			value = true;
		}
		
		return value;
	}
	
	/**
	 * @return
	 * This method returns which quadrant the given point belongs to
	 */
	public String quadrant(){
		
		int[] point = new int[2];
		
		point[0] = getX();
		point[1] = getY();
		
		String str = null;
		
		if (point[0] >= 0 && point[1] >= 0) 
			str = " Q1 ";
		else if (point[0] <= 0 && point[1] >= 0)
			str= " Q2 ";
		else if (point[0] <= 0 && point[1] <= 0)
			str= " Q3 ";
		else if (point[0] >= 0 && point[1] <= 0)
			str= " Q4 ";
		
		return str;
	}
	
	
}
