package ������.HomeWork6.Task0_TrainTickets;

import java.util.GregorianCalendar;

// �����.

abstract class Ticket {

private String pointOfDeparture; // ����� �������.
private String destinaton; // ����� ����������.
private GregorianCalendar dateAndTimeOfDeparture; // ���� � ����� �����������.
private int numberOfTrain; // ����� ������.
private int numberOfWagon; // ����� ������.
private int placeNumber; // ����� �����.
private double ticketPrice; // ���� ������.
private int ticketId; // ����� ������.
private TicketType ticketType; // ��� ������.
private UpDownPlace upDownPlace; // ������ ��� ������� �����.

public Ticket() {

}

public Ticket (String pointOfDeparture, String destinaton, GregorianCalendar dateAndTimeOfDeparture, int numberOfTrain, int numberOfWagon,
        int placeNumber, double ticketPrice, int ticketId, TicketType ticketType){

    this.pointOfDeparture = pointOfDeparture;
    this.destinaton = destinaton;
    this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
    this.numberOfTrain = numberOfTrain;
    this.numberOfWagon = numberOfWagon;
    this.placeNumber = placeNumber;
    this.ticketPrice = ticketPrice;
    this.ticketId = ticketId;
    this.ticketType = ticketType;

}

public String getPointOfDeparture() {
    return pointOfDeparture;
}
public void setPointOfDeparture(String pointOfDeparture) {
    this.pointOfDeparture = pointOfDeparture;
}
public String getDestinaton() {
    return destinaton;
}
public void setDestinaton(String destinaton) {
    this.destinaton = destinaton;
}
public GregorianCalendar  getDateAndTimeOfDeparture() {
    return dateAndTimeOfDeparture;
}
public void setDateAndTimeOfDeparture(GregorianCalendar dateAndTimeOfDeparture) {
    this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
}
public int getNumberOfTrain() {
    return numberOfTrain;
}
public void setNumberOfTrain(int numberOfTrain) {
    this.numberOfTrain = numberOfTrain;
}
public int getNumberOfWagon() {
    return numberOfWagon;
}
public void setNumberOfWagon(int numberOfWagon) {
    this.numberOfWagon = numberOfWagon;
}
public int getPlaceNumber() {
    return placeNumber;
}
public void setPlaceNumber(int placeNumber) {
    this.placeNumber = placeNumber;
}
public double getTicketPrice() {
    return ticketPrice;
}
public void setTicketPrice(double ticketPrice) {
    this.ticketPrice = ticketPrice;
}
public int getTicketId() {
    return ticketId;
}
public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
}
public TicketType getTicketType() {
    return ticketType;
}
public void setTicketType(TicketType ticketType) {
    this.ticketType = ticketType;
}
public UpDownPlace getUpDownPlace() {
    return upDownPlace;
}

public void setUpDownPlace() {
    if (this.placeNumber%2 == 0){
        this.upDownPlace = UpDownPlace.�������;
    } else {
        this.upDownPlace = UpDownPlace.������;
    }
}




}
