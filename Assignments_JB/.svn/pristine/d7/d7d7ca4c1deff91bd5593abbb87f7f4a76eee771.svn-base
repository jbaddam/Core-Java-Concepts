package com.joker.java.jaganreddy.lab6_7;

/**
 * @author Jagan Reddy
 *
 */
public class Demo {

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		Ticket ticket1 = new Ticket(18, 1);
		Ticket ticket2 = new Ticket(3, 13);
		
		//Ticket amount for Preset Values
		if (ticket.validateTravelPoints()) {
			System.out.println("Ticket amount for Preset Values");
			ticket.calculateTicketAmt();
			System.out.println("Ticket Amount is : " + ticket.getTicketAmount());
		} else {
			System.out.println("Invalid travel points");
		}

		
        //Ticket amount for Start point 1 and end point 18
		System.out.println("\nTicket amount for Start point " + ticket1.getEndPoint() + " and end point "
				+ ticket1.getStartPoint() );
		if (ticket1.validateTravelPoints()) {

			ticket1.calculateTicketAmt();
			System.out.println("Ticket Amount is : " + ticket1.getTicketAmount());
		}

		else {
			System.out.println("Invalid travel points");
		}

		
		
		//Ticket amount for Start point 13 and end point 3
		System.out.println("\nTicket amount for Start point " + ticket2.getEndPoint() + " and end point "
				+ ticket2.getStartPoint() );
		if (ticket2.validateTravelPoints()) {

			ticket2.calculateTicketAmt();
			System.out.println("Ticket Amount is : " + ticket2.getTicketAmount());
		}

		else {
			System.out.println("Invalid travel points");
		}

	}
}
