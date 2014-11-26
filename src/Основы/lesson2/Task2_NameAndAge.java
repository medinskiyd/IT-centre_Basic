package Основы.lesson2;

import java.util.Scanner;

/* 1. Пользователь вводит свое имя, попреветствовать пользователя по его имени.
 * 2. Пользователь вводит свой возраст, вывести на экран количество лет жизни. */

public class Task2_NameAndAge {

	public static void main(String[] args) {
		
		System.out.println("Введите свое имя:");
		
		Scanner scan = new Scanner(System.in); 
		
		String name = scan.nextLine(); // Ввод имени.
		
		System.out.println("Вас зовут: " + name); // Вывод имени.
		System.out.println("Введите свой возраст:"); 
		
		int age = scan.nextInt(); // Ввод возраста.
			
		System.out.println("Введите возраст в котором вы умрете: ");
		
		int ageToDie = scan.nextInt(); // Ввод возраста смерти.
		int oldToDie = ageToDie - age; // От возраста смерти отнимается текущий возраст.
		
		System.out.println("Вам осталось жить: " + oldToDie);

	}

}
