package ������.HomeWork6.Task0_TrainTickets;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

// �����.

public class TicketWindow {
	private int id = 0;
	private int yesNo;
	private double cash = 10000;
	private int password;
	
	ArrayList <Ticket> ticketsInTicketWindow = new ArrayList <Ticket> (); // ������ ������� � ������� � �����.
	ArrayList <Ticket> ticketsOutTicketWindow = new ArrayList <Ticket> (); // ������ ������� ��� � ����� (��������).

	// ��������� ������ � �����.
	public void addAllTicketInTicketWindow() {
		
		// ��������� ����������� ������ � 1-�� ������ �����.
		for (int i = 0; i < 36; i++) {
			id++;
			SecondClassTicket secondClassTicket = new SecondClassTicket("����", "������", new GregorianCalendar(2013,12,13,14,30,00), 1, 1,
					i+1, 500, id, TicketType.��������);
			ticketsInTicketWindow.add(secondClassTicket);
		}
		// ��������� ����������� ������� ������ 1-�� ������ � �����.
		for (int i = 0; i < 54; i++) {
			id++;
			SedentaryTicket sedentaryTicket = new SedentaryTicket("����", "������", new GregorianCalendar(2013,12,13,14,30,00), 1, 1,
					i+1, 200, id, TicketType.���������������);
			ticketsInTicketWindow.add(sedentaryTicket);
		}
		// ��������� ����������� ������� ������ 1-�� ������ � �����.
		for (int i = 0; i < 18; i++) {
			id++;
			LateralSeatTicket lateralSeatTicket = new LateralSeatTicket("����", "������", new GregorianCalendar(2013,12,13,14,30,00), 1, 1,
					i+1, 400, id, TicketType.���������������);
			ticketsInTicketWindow.add(lateralSeatTicket);
		}
		
		// ��������� �������� ������ 2-�� ������ � �����.
		for (int i = 0; i < 36; i++) {
			id++;
			CompartmentTicket compartmentTicket = new CompartmentTicket("����", "������", new GregorianCalendar(2013,12,13,14,30,00), 1, 2,
					i+1, 800, id, TicketType.����);
			ticketsInTicketWindow.add(compartmentTicket);
		}
		
		// ��������� �������� ������ 3-�� ������ � �����.
		for (int i = 0; i < 18; i++) {
			id++;
			SleepingTicket sleepingTicket = new SleepingTicket("����", "������", new GregorianCalendar(2013,12,13,14,30,00), 1, 3,
					i+1, 1200, id, TicketType.��������);
			ticketsInTicketWindow.add(sleepingTicket);
		}
		
	}
	
	// ������ ���������� � ������� ������� � �������.
	public void allTicketInTicketWindowInfo() {
		
		System.out.println("��� ������ ���� � �������:");
		for (int i = 0; i < ticketsInTicketWindow.size(); i++) {
			ticketsInTicketWindow.get(i).setUpDownPlace(); // ����� ������ ������ ��� ������� �����.
			
			System.out.println("����� ������ (id): "+ticketsInTicketWindow.get(i).getTicketId()+"; "+
				"����� �������: "+ticketsInTicketWindow.get(i).getPointOfDeparture()+"; "+
				"����� ��������: "+ticketsInTicketWindow.get(i).getDestinaton() +"; "+
				"���� � ����� �����������: "+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
				"����� ������: "+ticketsInTicketWindow.get(i).getNumberOfTrain()+"; "+
				"����� ������: "+ticketsInTicketWindow.get(i).getNumberOfWagon() +"; "+
				"����� �����: "+ticketsInTicketWindow.get(i).getPlaceNumber()+"; "+
				"����: "+ticketsInTicketWindow.get(i).getTicketPrice() +"; "+
				"��� ������: "+ticketsInTicketWindow.get(i).getTicketType() +"; "+
				"��� �����: "+ticketsInTicketWindow.get(i).getUpDownPlace() +"."
				);
		}
	}
	
	// ������ ���������� � ������� ������� ��� � �������.
	public void allTicketOutTicketWindowInfo() {
		
		System.out.println("���� ������� ��� � �������:");
		for (int i = 0; i < ticketsOutTicketWindow.size(); i++) {
			
			System.out.println("����� ������ (id): "+ticketsOutTicketWindow.get(i).getTicketId()+"; "+
				"����� �������: "+ticketsOutTicketWindow.get(i).getPointOfDeparture()+"; "+
				"����� ��������: "+ticketsOutTicketWindow.get(i).getDestinaton() +"; "+
				"���� � ����� �����������: "+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
				"����� ������: "+ticketsOutTicketWindow.get(i).getNumberOfTrain()+"; "+
				"����� ������: "+ticketsOutTicketWindow.get(i).getNumberOfWagon() +"; "+
				"����� �����: "+ticketsOutTicketWindow.get(i).getPlaceNumber()+"; "+
				"����: "+ticketsOutTicketWindow.get(i).getTicketPrice() +"; "+
				"��� ������: "+ticketsOutTicketWindow.get(i).getTicketType() +"; "+
				"��� �����: "+ticketsOutTicketWindow.get(i).getUpDownPlace() +"."
				);
		}
	}	
	
	// ������ ���������� � ������ (����� ������, ���� �����������, �����, �����)
	public void ticketInfoParam(int numberOfTrain, GregorianCalendar dateAndTimeOfDeparture, int numberOfWagon, int placeNumber) {
		
		for (int i = 0; i < ticketsInTicketWindow.size(); i++){
			ticketsInTicketWindow.get(i).setUpDownPlace(); // ����� ������ ������ ��� ������� �����.
			if (ticketsInTicketWindow.get(i).getNumberOfTrain() == numberOfTrain && 
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE == dateAndTimeOfDeparture.DATE &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH == dateAndTimeOfDeparture.MONTH &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR == dateAndTimeOfDeparture.YEAR &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR == dateAndTimeOfDeparture.HOUR &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE == dateAndTimeOfDeparture.MINUTE &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND == dateAndTimeOfDeparture.SECOND &&
				ticketsInTicketWindow.get(i).getNumberOfWagon() == numberOfWagon &&
				ticketsInTicketWindow.get(i).getPlaceNumber() == placeNumber) {
			 
			System.out.println("���� � �������:");
			System.out.println("����� ������ (id): "+ticketsInTicketWindow.get(i).getTicketId()+"; "+
					"����� �������: "+ticketsInTicketWindow.get(i).getPointOfDeparture()+"; "+
					"����� ��������: "+ticketsInTicketWindow.get(i).getDestinaton() +"; "+
					"���� � ����� �����������: "+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
					"����� ������: "+ticketsInTicketWindow.get(i).getNumberOfTrain()+"; "+
					"����� ������: "+ticketsInTicketWindow.get(i).getNumberOfWagon() +"; "+
					"����� �����: "+ticketsInTicketWindow.get(i).getPlaceNumber()+"; "+
					"����: "+ticketsInTicketWindow.get(i).getTicketPrice() +"; "+
					"��� ������: "+ticketsInTicketWindow.get(i).getTicketType() +"; "+
					"��� �����: "+ticketsInTicketWindow.get(i).getUpDownPlace() +"."
					);
			} 
		}
		
		for (int i = 0; i < ticketsOutTicketWindow.size(); i++){
		if (ticketsOutTicketWindow.get(i).getNumberOfTrain() == numberOfTrain && 
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().DATE == dateAndTimeOfDeparture.DATE &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH == dateAndTimeOfDeparture.MONTH &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR == dateAndTimeOfDeparture.YEAR &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR == dateAndTimeOfDeparture.HOUR &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE == dateAndTimeOfDeparture.MINUTE &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND == dateAndTimeOfDeparture.SECOND &&
				ticketsOutTicketWindow.get(i).getNumberOfWagon() == numberOfWagon &&
				ticketsOutTicketWindow.get(i).getPlaceNumber() == placeNumber) {
			System.out.println("����� �� ��� ����� ������.");
			}
		}
	}
	
	// �������� ����� (����� �� ������, ������� ����� � ����������).
	public void buyTicket(double buyerMoney, int numberOfTrain, GregorianCalendar dateAndTimeOfDeparture, int numberOfWagon, int placeNumber){
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < ticketsInTicketWindow.size(); i++){
			ticketsInTicketWindow.get(i).setUpDownPlace(); // ����� ������ ������ ��� ������� �����.
			if (ticketsInTicketWindow.get(i).getNumberOfTrain() == numberOfTrain && 
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE == dateAndTimeOfDeparture.DATE &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH == dateAndTimeOfDeparture.MONTH &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR == dateAndTimeOfDeparture.YEAR &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR == dateAndTimeOfDeparture.HOUR &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE == dateAndTimeOfDeparture.MINUTE &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND == dateAndTimeOfDeparture.SECOND &&
				ticketsInTicketWindow.get(i).getNumberOfWagon() == numberOfWagon &&
				ticketsInTicketWindow.get(i).getPlaceNumber() == placeNumber &&
				ticketsInTicketWindow.get(i).getTicketPrice() < buyerMoney) {
			 
			
			System.out.println("����� ������ (id): "+ticketsInTicketWindow.get(i).getTicketId()+"; "+
				"����� �������: "+ticketsInTicketWindow.get(i).getPointOfDeparture()+"; "+
				"����� ��������: "+ticketsInTicketWindow.get(i).getDestinaton() +"; "+
				"���� � ����� �����������: "+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
				"����� ������: "+ticketsInTicketWindow.get(i).getNumberOfTrain()+"; "+
				"����� ������: "+ticketsInTicketWindow.get(i).getNumberOfWagon() +"; "+
				"����� �����: "+ticketsInTicketWindow.get(i).getPlaceNumber()+"; "+
				"����: "+ticketsInTicketWindow.get(i).getTicketPrice() +"; "+
				"��� ������: "+ticketsInTicketWindow.get(i).getTicketType() +"; "+
				"��� �����: "+ticketsInTicketWindow.get(i).getUpDownPlace() +"."
				);
			
			System.out.println("���� �� ��������� ���� ����� - ������� 1, ���� ��� ������� 2. ���� ������ ���������� �������� ������� � ������� - ������� 3.");
			yesNo = scan.nextInt();
			
			if(yesNo == 1){
			ticketsOutTicketWindow.add(i, ticketsInTicketWindow.get(i)); // ����� ����� �� �������� �� �������� � �������� � �������� ��������.
			
			cash = cash + ticketsInTicketWindow.get(i).getTicketPrice(); // ��������� ������ � ����� �� ��������� ������.
			ticketsInTicketWindow.remove(i); // ������� ����� �� �������� �� �������� �������.
			System.out.println("� ��� ���������� ����� � ����� ���� � �������, ������� �����!");
			return;
			} else if (yesNo == 3) {
				return;
			}
			
			} 
		}
		
		for (int i = 0; i < ticketsInTicketWindow.size(); i++){
		if (ticketsOutTicketWindow.get(i).getNumberOfTrain() == numberOfTrain && 
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().DATE == dateAndTimeOfDeparture.DATE &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH == dateAndTimeOfDeparture.MONTH &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR == dateAndTimeOfDeparture.YEAR &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR == dateAndTimeOfDeparture.HOUR &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE == dateAndTimeOfDeparture.MINUTE &&
				ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND == dateAndTimeOfDeparture.SECOND &&
				ticketsOutTicketWindow.get(i).getNumberOfWagon() == numberOfWagon &&
				ticketsOutTicketWindow.get(i).getPlaceNumber() == placeNumber) {
				System.out.println("��������, ����� �� ��� ����� ������ ��� � ��� ������������ �����.");
				return;
			} 
		}
		scan.close();
		
	}

	// ����� ����� � �����.
	public void returnTicket(int ticketId, int numberOfTrain, GregorianCalendar dateAndTimeOfDeparture, int numberOfWagon, int placeNumber){
		
		for (int i = 0; i < ticketsOutTicketWindow.size(); i++){
			if (ticketsOutTicketWindow.get(i).getTicketId() == ticketId &&
					ticketsOutTicketWindow.get(i).getNumberOfTrain() == numberOfTrain && 
					ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().DATE == dateAndTimeOfDeparture.DATE &&
					ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH == dateAndTimeOfDeparture.MONTH &&
					ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR == dateAndTimeOfDeparture.YEAR &&
					ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR == dateAndTimeOfDeparture.HOUR &&
					ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE == dateAndTimeOfDeparture.MINUTE &&
					ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND == dateAndTimeOfDeparture.SECOND &&
					ticketsOutTicketWindow.get(i).getNumberOfWagon() == numberOfWagon &&
					ticketsOutTicketWindow.get(i).getPlaceNumber() == placeNumber) {
			 
			System.out.println("����� ����� ��� ������.");
			System.out.println("����� ������ (id): "+ticketsOutTicketWindow.get(i).getTicketId()+"; "+
				"����� �������: "+ticketsOutTicketWindow.get(i).getPointOfDeparture()+"; "+
				"����� ��������: "+ticketsOutTicketWindow.get(i).getDestinaton() +"; "+
				"���� � ����� �����������: "+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
				"����� ������: "+ticketsOutTicketWindow.get(i).getNumberOfTrain()+"; "+
				"����� ������: "+ticketsOutTicketWindow.get(i).getNumberOfWagon() +"; "+
				"����� �����: "+ticketsOutTicketWindow.get(i).getPlaceNumber()+"; "+
				"����: "+ticketsOutTicketWindow.get(i).getTicketPrice() +"; "+
				"��� ������: "+ticketsOutTicketWindow.get(i).getTicketType() +"; "+
				"��� �����: "+ticketsOutTicketWindow.get(i).getUpDownPlace() +"."
				);
			
			if (cash > +ticketsOutTicketWindow.get(i).getTicketPrice()) {
				
				ticketsInTicketWindow.add(i, ticketsOutTicketWindow.get(i)); // ����� ����� �� �������� �������� � �������� � �������� �� ��������.
				
				cash = cash - ticketsOutTicketWindow.get(i).getTicketPrice(); // ��������� ������ � ����� �� ��������� ������.
				System.out.println("����� ��������� � �����, �������� ������! "+ticketsOutTicketWindow.get(i).getTicketPrice());
				ticketsOutTicketWindow.remove(i); // ������� ����� �� �������� �������� �������.
			} else { 
				System.out.println("� ����� ������������ �����. ��������, �� �� ������� ������� ����� � ������ ������.");
			}
		}
	}
		System.out.println();
}
		
	// �������� ���������. ( �� ��������, �������� ����������� �������� ������).
	public void collection () {
		
		System.out.println("������� ������ ��� ���������: ");
		Scanner scan = new Scanner(System.in);
		password = scan.nextInt();
		
		if (password == 1234) {
			System.out.println("������ � �����: "+getCash());
			System.out.println("���������� ������� � �������: "+getId());
			System.out.println("���������� ������� � �����: "+getTicketsInTicketWindow().size());
			System.out.println("���������� ��������� �������: "+getTicketsOutTicketWindow().size());
		} else {
			System.out.println("�������� ������.");
		}
		scan.close();
		
	}
	
	
	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Ticket> getTicketsInTicketWindow() {
		return ticketsInTicketWindow;
	}

	public void setTicketsInTicketWindow(ArrayList<Ticket> ticketsInTicketWindow) {
		this.ticketsInTicketWindow = ticketsInTicketWindow;
	}

	public ArrayList<Ticket> getTicketsOutTicketWindow() {
		return ticketsOutTicketWindow;
	}

	public void setTicketsOutTicketWindow(ArrayList<Ticket> ticketsOutTicketWindow) {
		this.ticketsOutTicketWindow = ticketsOutTicketWindow;
	}
	
	
}
