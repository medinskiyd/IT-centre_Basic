package ������.HomeWork6.Task0_TrainTickets;

import java.util.GregorianCalendar;

// ������� �����.

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

	private TicketType ticketType  = TicketType.���������������; // ��� ������.
	private UpDownPlace upDownPlace = UpDownPlace.������; // ������ �����.
	
	@Override
	public TicketType getTicketType() {
		return ticketType;
	}
	
	@Override	
	public UpDownPlace getUpDownPlace() {
		return upDownPlace;
	}

}
