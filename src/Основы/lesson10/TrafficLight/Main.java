package Основы.lesson10.TrafficLight;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <TrafficLight> list = new ArrayList <TrafficLight> ();
		list.add(new TrafficLight(Color.RED, 2000, "1"));
		list.add(new TrafficLight(Color.RED, 2000, "2"));
		list.add(new TrafficLight(Color.RED, 2000, "3"));
		list.add(new TrafficLight(Color.RED, 2000, "4"));
		
		Lights lights = new Lights(list);
		lights.start();

	}

}
