package Основы.HomeWork6.Task0_TrainTickets;

import java.util.GregorianCalendar;

// Купейный билет.

public class CompartmentTicket extends Ticket {

	public CompartmentTicket() {
		
	}
	
	public CompartmentTicket(String pointOfDeparture, String destinaton,
			GregorianCalendar dateAndTimeOfDeparture, int numberOfTrain,
			int numberOfWagon, int placeNumber, double ticketPrice,
			int ticketId, TicketType ticketType) {
		super(pointOfDeparture, destinaton, dateAndTimeOfDeparture, numberOfTrain,
				numberOfWagon, placeNumber, ticketPrice, ticketId, ticketType);
		// TODO Auto-generated constructor stub
	}

	private TicketType ticketType  = TicketType.КУПЕ; // Тип билета.

	@Override
	public TicketType getTicketType() {
		return ticketType;
	}
	
}
