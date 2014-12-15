package Основы.lesson7.Task2;

public class Main {
	
	/* Создать 3 машины использюя класс Car.
	 * Завести все машины. Поехать всем машинам. Остановиться всем машинам.
	 * Заставить поехать 2 машины не заводя, должно выскочить предупреждение "Машина не заведена, заведите".
	 * 
	 */
	
	public static void main(String[] args) {

		//Создаем 3 машины.
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		//Завели 3 машины.
		car1.start();
		car2.start();
		car3.start();
		
		// Задаем цвета машинам.
		car1.setColor("red");
		car2.setColor("blue");
		car3.setColor("green");
		
		//Завели 3 машины.
		car1.run();
		car2.run();
		car3.run();
		
		// Остановили 3 машины.
		car1.stop();
		car2.stop();
		car3.stop();
		
		System.out.println();
		
		//Просим 2 машины поехать. Они должны попросить нас поехать.
		car1.run();
		car2.run();
		
	}

}
