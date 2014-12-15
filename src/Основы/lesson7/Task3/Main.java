package Основы.lesson7.Task3;

import java.util.Scanner;

public class Main {
	
	//Проделать арифметические операции с ООП переменными типа Int.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите число №1:");
		int value1 = scan.nextInt();
		
		System.out.println("Введите число №2:");
		int value2 = scan.nextInt();
		
		Int firstInt = new Int(); //Первая переменная типа Int.
		Int secondInt = new Int(); //Вторая переменная типа Int.		
		
		firstInt.setValue(value1);
		secondInt.setValue(value2);
		
		//Сумма 2-х переменных типа Int.
		Int sum = firstInt.add(secondInt);
		int sum1 = sum.getValue();
		
		System.out.println("Сумма " + firstInt.getValue() + " + " + secondInt.getValue() + " = " + sum1 + ".");
		
		//Умножение 2-х переменных типа Int.
		Int multip = firstInt.multip(secondInt);
		int multip1 = multip.getValue();
		System.out.println("Умножение " + firstInt.getValue() + " * " + secondInt.getValue() + " = " + multip1 + ".");
		
		//Деление 2-х переменных типа Int.
		Int div = firstInt.div(secondInt);
		int div1 = div.getValue();
		System.out.println("Деление " + firstInt.getValue() + " / " + secondInt.getValue() + " = " + div1 + ".");
	
		scan.close();
	}
}
