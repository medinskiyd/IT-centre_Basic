package Îñíîâû.HomeWork6.Task0_TrainTickets;

import java.util.GregorianCalendar;

// Ïëàöêàğò.

public class SecondClassTicket extends Ticket { 
	
	public SecondClassTicket() {
		
	}
	
	public SecondClassTicket(String pointOfDeparture, String destinaton,
			GregorianCalendar dateAndTimeOfDeparture, int numberOfTrain,
			int numberOfWagon, int placeNumber, double ticketPrice,
			int ticketId, TicketType ticketType) {
		super(pointOfDeparture, destinaton, dateAndTimeOfDeparture, numberOfTrain,
				numberOfWagon, placeNumber, ticketPrice, ticketId, ticketType);
	}

	private TicketType ticketType = TicketType.ÏËÀÖÊÀĞÒ;

	@Override
	public TicketType getTicketType() {
		return ticketType;
	}	

}
