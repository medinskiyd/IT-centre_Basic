package Основы.HomeWork4.Task2_MyCalcConsoleMenu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Выберите одно действие: 1. Сложение; 2. Вычитание. 3.Умножение. 4. Деление.");
		int action = scan.nextInt();
		
		System.out.println("Введите 2 числа:");
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		MyCalcConsoleMenu values = new MyCalcConsoleMenu();
		
		values.setValue(first, second);

		// Выполняется сложение.
		if (action == 1) {
			System.out.println("Выполняется сложение:");
			System.out.println(first + " + " + second + " = " + values.add() + ".");
		}
		
		// Выполняется вычитание.
		if (action == 2) {
			System.out.println("Выполняется вычитание:");
			System.out.println(first + " - " + second + " = " + values.sub() + ".");
		}
		
		// Выполняется умножение.
		if (action == 3) {
			System.out.println("Выполняется умножение:");
			System.out.println(first + " * " + second + " = " + values.multip() + ".");				
		}

		// Выполняется деление.
		if (action == 4) {
			System.out.println("Выполняется деление:");
			System.out.println(first + " / " + second + " = " + values.div() + ".");				
		}
		scan.close();
	}
}
