package Основы.HomeWork6.Task0_TrainTickets;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Train {
	
	private int numberTrain; // Номер поезда.
	private String pointOfDeparture; // Пункт отбытия.
	private String destination; // Пункт назначения.
	private GregorianCalendar dateAndTimeOfDeparture; // Дата и время отправления.
	
	ArrayList <Wagon> wagons = new ArrayList <Wagon> ();
	ReservedSeatWagon rsw = new ReservedSeatWagon();
	CompartmentWagon cw = new CompartmentWagon();
	SleepingWagon sw = new SleepingWagon();
	WagonRestaurant wr = new WagonRestaurant();
	Locomotive l = new Locomotive();
	
	// Добавляем вагоны в поезд и места в вагоны.
	public void addWagonsInTrain(){
		
		wagons.add(rsw);
		
		for (int i = 1; i < 37; i++) {
			rsw.addPlace(i);
		}
		
		wagons.add(cw);
		
		for (int i = 1; i < 18; i++) {
			cw.addPlace(i);
		}
		
		wagons.add(sw);
		
		for (int i = 1; i < 18; i++) {
			sw.addPlace(i);
		}
		
		wagons.add(wr);
		
		wagons.add(l);
		
	}

	
	// Добраться до пункта назначения.
	public void arrive () {
		
		System.out.println("Поезд приехал");
		
		rsw.allPassengersDropOff(destination);
		cw.allPassengersDropOff(destination);
		sw.allPassengersDropOff(destination);
		
		System.out.println("Пасажиры из всех вагонов высажены.");
	}


	public int getNumberTrain() {
		return numberTrain;
	}


	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}


	public String getPointOfDeparture() {
		return pointOfDeparture;
	}


	public void setPointOfDeparture(String pointOfDeparture) {
		this.pointOfDeparture = pointOfDeparture;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public GregorianCalendar getDateAndTimeOfDeparture() {
		return dateAndTimeOfDeparture;
	}


	public void setDateAndTimeOfDeparture(GregorianCalendar dateAndTimeOfDeparture) {
		this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
	}


	public ArrayList<Wagon> getWagons() {
		return wagons;
	}


	public void setWagons(ArrayList<Wagon> wagons) {
		this.wagons = wagons;
	}
	
	
	
}
