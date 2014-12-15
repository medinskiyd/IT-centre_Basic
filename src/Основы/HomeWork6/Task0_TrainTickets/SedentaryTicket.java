package ќсновы.HomeWork6.Task0_TrainTickets;

import java.util.GregorianCalendar;

// —ид€чий билет.

public class SedentaryTicket extends SecondClassTicket {
	
	public SedentaryTicket() {
		
	}
	
	public SedentaryTicket(String pointOfDeparture, String destinaton,
			GregorianCalendar dateAndTimeOfDeparture, int numberOfTrain,
			int numberOfWagon, int placeNumber, double ticketPrice,
			int ticketId, TicketType ticketType) {
		super(pointOfDeparture, destinaton, dateAndTimeOfDeparture, numberOfTrain,
				numberOfWagon, placeNumber, ticketPrice, ticketId, ticketType);
	}

	private TicketType ticketType  = TicketType.ѕЋј÷ ј–“—»ƒя„»…; // “ип билета.
	private UpDownPlace upDownPlace = UpDownPlace.Ќ»∆Ќ≈≈; // Ќижнее место.
	
	@Override
	public TicketType getTicketType() {
		return ticketType;
	}
	
	@Override	
	public UpDownPlace getUpDownPlace() {
		return upDownPlace;
	}

}
