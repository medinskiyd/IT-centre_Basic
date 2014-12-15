package Основы.lesson16.SwingFrame.TrafficLightUpdate;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TrafficLight extends Thread  {
	private int delay;
	private int timeNow;
	private int time;

	
	private int delayNight;
	private String name;
	
	public TrafficLight (String name, int delay, int time, int delayNight) {
		this.name = name;
		this.delay = delay;
	}
	
	// Переопределяем метод run() наследуемого класса Thread.
		@Override
		public void run() {
			GregorianCalendar gC = new GregorianCalendar();
			int curHour = gC.get(Calendar.HOUR_OF_DAY);
			
			try {
				if (curHour >= 6 && curHour <= 23){
					System.out.println(name + " " +Color.GREEN);
					sleep(delay); 
					System.out.println(name + " " +Color.YELLOW);
					sleep(delay);
					System.out.println(name + " " +Color.RED);
					sleep(delay);
					System.out.println(name + " " +Color.YELLOW);
					sleep(delay);
					} else {
						System.out.println(name + " " +Color.YELLOW);
						sleep(delayNight);
					}
				
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
}