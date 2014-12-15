package Основы.lesson14.Task2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		//??????? 6 ?????.
		ArrayList <Car> cars = new ArrayList  ();
		ArrayList <Car> sortCars = new ArrayList  ();

		cars.add(new Car("Audi1", "TT", 2099));
		cars.add(new Car("Audi2", "TT", 2045));
		cars.add(new Car("Audi3", "TT", 2067));
		cars.add(new Car("Audi4", "TT", 2054));
		cars.add(new Car("Audi5", "TT", 2004));
		cars.add(new Car("Audi6", "TT", 2000));

		sortCars = cars;
		Collections.sort(sortCars);


		System.out.println("????? "+cars.size()+" ???????????:");
		int j = 0;
		while (j < cars.size()){

			System.out.print(cars.get(j).getName()+": "+cars.get(j).getYear()+";");
			System.out.println();
		j++;
		}

		System.out.println("??????????????? ?????????? ?? ?????? ?????? ?? ?????? ???????:");
		
		int i = 0;
		while (i < cars.size()){
			
			System.out.print(sortCars.get(i).getName()+": "+sortCars.get(i).getYear()+";");
			System.out.println();
		i++;
		}
	}

}
