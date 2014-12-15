package Основы.HomeWork6.Task0_TrainTickets;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

// Касса.

public class TicketWindow {
	private int id = 0;
	private int yesNo;
	private double cash = 10000;
	private int password;
	
	ArrayList <Ticket> ticketsInTicketWindow = new ArrayList <Ticket> (); // Билеты которые в наличии в кассе.
	ArrayList <Ticket> ticketsOutTicketWindow = new ArrayList <Ticket> (); // Билеты которых нет в кассе (проданые).

	// Добавляет билеты в кассу.
	public void addAllTicketInTicketWindow() {
		
		// Добавляем плацкартные билеты в 1-го вагона кассу.
		for (int i = 0; i < 36; i++) {
			id++;
			SecondClassTicket secondClassTicket = new SecondClassTicket("Киев", "Москва", new GregorianCalendar(2013,12,13,14,30,00), 1, 1,
					i+1, 500, id, TicketType.ПЛАЦКАРТ);
			ticketsInTicketWindow.add(secondClassTicket);
		}
		// Добавляем плацкартные сидячие билеты 1-го вагона в кассу.
		for (int i = 0; i < 54; i++) {
			id++;
			SedentaryTicket sedentaryTicket = new SedentaryTicket("Киев", "Москва", new GregorianCalendar(2013,12,13,14,30,00), 1, 1,
					i+1, 200, id, TicketType.ПЛАЦКАРТСИДЯЧИЙ);
			ticketsInTicketWindow.add(sedentaryTicket);
		}
		// Добавляем плацкартные боковые билеты 1-го вагона в кассу.
		for (int i = 0; i < 18; i++) {
			id++;
			LateralSeatTicket lateralSeatTicket = new LateralSeatTicket("Киев", "Москва", new GregorianCalendar(2013,12,13,14,30,00), 1, 1,
					i+1, 400, id, TicketType.ПЛАЦКАРТБОКОВОЕ);
			ticketsInTicketWindow.add(lateralSeatTicket);
		}
		
		// Добавляем купейные билеты 2-го вагона в кассу.
		for (int i = 0; i < 36; i++) {
			id++;
			CompartmentTicket compartmentTicket = new CompartmentTicket("Киев", "Москва", new GregorianCalendar(2013,12,13,14,30,00), 1, 2,
					i+1, 800, id, TicketType.КУПЕ);
			ticketsInTicketWindow.add(compartmentTicket);
		}
		
		// Добавляем спальные билеты 3-го вагона в кассу.
		for (int i = 0; i < 18; i++) {
			id++;
			SleepingTicket sleepingTicket = new SleepingTicket("Киев", "Москва", new GregorianCalendar(2013,12,13,14,30,00), 1, 3,
					i+1, 1200, id, TicketType.СПАЛЬНЫЙ);
			ticketsInTicketWindow.add(sleepingTicket);
		}
		
	}
	
	// Узнает информацию о билетах которые в наличие.
	public void allTicketInTicketWindowInfo() {
		
		System.out.println("Эти билеты есть в наличии:");
		for (int i = 0; i < ticketsInTicketWindow.size(); i++) {
			ticketsInTicketWindow.get(i).setUpDownPlace(); // Метод решает нижнее или верхнее место.
			
			System.out.println("Номер билета (id): "+ticketsInTicketWindow.get(i).getTicketId()+"; "+
				"Пункт отбытия: "+ticketsInTicketWindow.get(i).getPointOfDeparture()+"; "+
				"Пункт прибытия: "+ticketsInTicketWindow.get(i).getDestinaton() +"; "+
				"Дата и время отправления: "+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
				"Номер поезда: "+ticketsInTicketWindow.get(i).getNumberOfTrain()+"; "+
				"Номер вагона: "+ticketsInTicketWindow.get(i).getNumberOfWagon() +"; "+
				"Номер места: "+ticketsInTicketWindow.get(i).getPlaceNumber()+"; "+
				"Цена: "+ticketsInTicketWindow.get(i).getTicketPrice() +"; "+
				"Тип билета: "+ticketsInTicketWindow.get(i).getTicketType() +"; "+
				"Тип места: "+ticketsInTicketWindow.get(i).getUpDownPlace() +"."
				);
		}
	}
	
	// Узнает информацию о билетах которых нет в наличие.
	public void allTicketOutTicketWindowInfo() {
		
		System.out.println("Этих билетов нет в наличии:");
		for (int i = 0; i < ticketsOutTicketWindow.size(); i++) {
			
			System.out.println("Номер билета (id): "+ticketsOutTicketWindow.get(i).getTicketId()+"; "+
				"Пункт отбытия: "+ticketsOutTicketWindow.get(i).getPointOfDeparture()+"; "+
				"Пункт прибытия: "+ticketsOutTicketWindow.get(i).getDestinaton() +"; "+
				"Дата и время отправления: "+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
				"Номер поезда: "+ticketsOutTicketWindow.get(i).getNumberOfTrain()+"; "+
				"Номер вагона: "+ticketsOutTicketWindow.get(i).getNumberOfWagon() +"; "+
				"Номер места: "+ticketsOutTicketWindow.get(i).getPlaceNumber()+"; "+
				"Цена: "+ticketsOutTicketWindow.get(i).getTicketPrice() +"; "+
				"Тип билета: "+ticketsOutTicketWindow.get(i).getTicketType() +"; "+
				"Тип места: "+ticketsOutTicketWindow.get(i).getUpDownPlace() +"."
				);
		}
	}	
	
	// Узнает информацию о билете (номер поезда, дата отправления, вагон, место)
	public void ticketInfoParam(int numberOfTrain, GregorianCalendar dateAndTimeOfDeparture, int numberOfWagon, int placeNumber) {
		
		for (int i = 0; i < ticketsInTicketWindow.size(); i++){
			ticketsInTicketWindow.get(i).setUpDownPlace(); // Метод решает нижнее или верхнее место.
			if (ticketsInTicketWindow.get(i).getNumberOfTrain() == numberOfTrain && 
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE == dateAndTimeOfDeparture.DATE &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH == dateAndTimeOfDeparture.MONTH &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR == dateAndTimeOfDeparture.YEAR &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR == dateAndTimeOfDeparture.HOUR &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE == dateAndTimeOfDeparture.MINUTE &&
				ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND == dateAndTimeOfDeparture.SECOND &&
				ticketsInTicketWindow.get(i).getNumberOfWagon() == numberOfWagon &&
				ticketsInTicketWindow.get(i).getPlaceNumber() == placeNumber) {
			 
			System.out.println("Есть в наличии:");
			System.out.println("Номер билета (id): "+ticketsInTicketWindow.get(i).getTicketId()+"; "+
					"Пункт отбытия: "+ticketsInTicketWindow.get(i).getPointOfDeparture()+"; "+
					"Пункт прибытия: "+ticketsInTicketWindow.get(i).getDestinaton() +"; "+
					"Дата и время отправления: "+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
					+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
					"Номер поезда: "+ticketsInTicketWindow.get(i).getNumberOfTrain()+"; "+
					"Номер вагона: "+ticketsInTicketWindow.get(i).getNumberOfWagon() +"; "+
					"Номер места: "+ticketsInTicketWindow.get(i).getPlaceNumber()+"; "+
					"Цена: "+ticketsInTicketWindow.get(i).getTicketPrice() +"; "+
					"Тип билета: "+ticketsInTicketWindow.get(i).getTicketType() +"; "+
					"Тип места: "+ticketsInTicketWindow.get(i).getUpDownPlace() +"."
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
			System.out.println("Билет на это место продан.");
			}
		}
	}
	
	// Покупает билет (билет не продан, хватает денег у покупателя).
	public void buyTicket(double buyerMoney, int numberOfTrain, GregorianCalendar dateAndTimeOfDeparture, int numberOfWagon, int placeNumber){
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < ticketsInTicketWindow.size(); i++){
			ticketsInTicketWindow.get(i).setUpDownPlace(); // Метод решает нижнее или верхнее место.
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
			 
			
			System.out.println("Номер билета (id): "+ticketsInTicketWindow.get(i).getTicketId()+"; "+
				"Пункт отбытия: "+ticketsInTicketWindow.get(i).getPointOfDeparture()+"; "+
				"Пункт прибытия: "+ticketsInTicketWindow.get(i).getDestinaton() +"; "+
				"Дата и время отправления: "+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
				+ticketsInTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
				"Номер поезда: "+ticketsInTicketWindow.get(i).getNumberOfTrain()+"; "+
				"Номер вагона: "+ticketsInTicketWindow.get(i).getNumberOfWagon() +"; "+
				"Номер места: "+ticketsInTicketWindow.get(i).getPlaceNumber()+"; "+
				"Цена: "+ticketsInTicketWindow.get(i).getTicketPrice() +"; "+
				"Тип билета: "+ticketsInTicketWindow.get(i).getTicketType() +"; "+
				"Тип места: "+ticketsInTicketWindow.get(i).getUpDownPlace() +"."
				);
			
			System.out.println("Если Вы покупаете этот билет - нажмите 1, если нет нажмите 2. Если хотите остановить просмотр билетов в наличии - нажмите 3.");
			yesNo = scan.nextInt();
			
			if(yesNo == 1){
			ticketsOutTicketWindow.add(i, ticketsInTicketWindow.get(i)); // Берем билет из колекции не проданых и помещаем в колекцию проданых.
			
			cash = cash + ticketsInTicketWindow.get(i).getTicketPrice(); // Добавляет деньги в кассу от проданого билета.
			ticketsInTicketWindow.remove(i); // Удаляем билет из колекции не проданых билетов.
			System.out.println("У Вас достаточно денег и билет есть в наличии, держите билет!");
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
				System.out.println("Извините, билет на это место продан или у вас недостаточно денег.");
				return;
			} 
		}
		scan.close();
		
	}

	// Сдает билет в кассу.
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
			 
			System.out.println("Такой билет был продан.");
			System.out.println("Номер билета (id): "+ticketsOutTicketWindow.get(i).getTicketId()+"; "+
				"Пункт отбытия: "+ticketsOutTicketWindow.get(i).getPointOfDeparture()+"; "+
				"Пункт прибытия: "+ticketsOutTicketWindow.get(i).getDestinaton() +"; "+
				"Дата и время отправления: "+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().DATE + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MONTH + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().YEAR + " " +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().HOUR + ":" +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().MINUTE + ":" +
				+ticketsOutTicketWindow.get(i).getDateAndTimeOfDeparture().SECOND + "; " +
				"Номер поезда: "+ticketsOutTicketWindow.get(i).getNumberOfTrain()+"; "+
				"Номер вагона: "+ticketsOutTicketWindow.get(i).getNumberOfWagon() +"; "+
				"Номер места: "+ticketsOutTicketWindow.get(i).getPlaceNumber()+"; "+
				"Цена: "+ticketsOutTicketWindow.get(i).getTicketPrice() +"; "+
				"Тип билета: "+ticketsOutTicketWindow.get(i).getTicketType() +"; "+
				"Тип места: "+ticketsOutTicketWindow.get(i).getUpDownPlace() +"."
				);
			
			if (cash > +ticketsOutTicketWindow.get(i).getTicketPrice()) {
				
				ticketsInTicketWindow.add(i, ticketsOutTicketWindow.get(i)); // Берем билет из колекции проданых и помещаем в колекцию не проданых.
				
				cash = cash - ticketsOutTicketWindow.get(i).getTicketPrice(); // Добавляет деньги в кассу от проданого билета.
				System.out.println("Билет возвращен в кассу, возьмите деньги! "+ticketsOutTicketWindow.get(i).getTicketPrice());
				ticketsOutTicketWindow.remove(i); // Удаляем билет из колекции проданых билетов.
			} else { 
				System.out.println("В кассе недостаточно денег. Извините, Вы не сможете вернуть билет в данный момент.");
			}
		}
	}
		System.out.println();
}
		
	// Проводит инкасацию. ( Не работает, почемуто неправильно читается стринг).
	public void collection () {
		
		System.out.println("Введите пароль для инкасации: ");
		Scanner scan = new Scanner(System.in);
		password = scan.nextInt();
		
		if (password == 1234) {
			System.out.println("Деньги в кассе: "+getCash());
			System.out.println("Количество билетов в обороте: "+getId());
			System.out.println("Количество билетов в кассе: "+getTicketsInTicketWindow().size());
			System.out.println("Количество проданных билетов: "+getTicketsOutTicketWindow().size());
		} else {
			System.out.println("Неверный пароль.");
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
