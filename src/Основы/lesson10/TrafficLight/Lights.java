package Основы.lesson10.TrafficLight;

import java.util.ArrayList;

public class Lights {
	private ArrayList<TrafficLight> list;
	
	public Lights (ArrayList<TrafficLight> list) {
		this.list = list;
	}
	
	public void start() {
		for (; true;) {
			try {
				Thread.sleep(1000); 
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; i < list.size(); i++) {
			list.get(i).switchLight();
			list.get(i).light();
			}
		}
	}
}
