package com.joker.java.jaganreddy.lab6_7;


/**
 * @author Jagan Reddy
 *
 */
public class Ticket {
    
	private int startPoint;
	private int endPoint;
	private int ticketAmount;
	
	
	/**
	 * default Constructor
	 */
	public Ticket() {
		super();
		this.startPoint = 2;
		this.endPoint = 18;
	}
	
	
	/** Parameterized Constructor
	 * @param startPoint
	 * @param endPoint
	 */
	public Ticket(int startPoint, int endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public int getStartPoint() {
		return startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public int getTicketAmount() {
		return ticketAmount;
	}
	
	/**
	 * This method decide whether travel points are valid or not
	 * @return
	 */
	public boolean  validateTravelPoints(){
		
		if((startPoint<endPoint)&&((startPoint>0)&&(endPoint>0))){
			return true;
		}
		
		return false;
		
	}
	
	
	/**
	 * This method calculates the ticket price
	 */
	public void calculateTicketAmt() {
		 ticketAmount = (endPoint - startPoint)*20;
	}
	
	
	
	
	
	

}
