package Основы.HomeWork4.Task0_IntMath;

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
			
			//Разница 2-х переменных типа Int.
			Int diff = firstInt.diff(secondInt);
			int diff1 = diff.getValue();
					
			System.out.println("Разница " + firstInt.getValue() + " - " + secondInt.getValue() + " = " + diff1 + ".");
			
			//Умножение 2-х переменных типа Int.
			Int multip = firstInt.multip(secondInt);
			int multip1 = multip.getValue();
			System.out.println("Умножение " + firstInt.getValue() + " * " + secondInt.getValue() + " = " + multip1 + ".");
			
			//Деление 2-х переменных типа Int.
			Int div = firstInt.div(secondInt);
			int div1 = div.getValue();
			System.out.println("Деление " + firstInt.getValue() + " / " + secondInt.getValue() + " = " + div1 + ".");
		
			//Возведение первого числа типа Int в степень равный второму типа Int.
			Int pow = firstInt.pow(secondInt);
			int pow1 = pow.getValue();
			System.out.println("Возведение числа " + firstInt.getValue() + " в степень " + secondInt.getValue() + " = " + pow1 + ".");
			
			//Факториал первого числа типа Int.
			Int fact = firstInt.fact(secondInt);
			int fact1 = fact.getValue();
			System.out.println("Факториал " + firstInt.getValue() + " = " + fact1 + ".");
			
			//Факториал первого числа типа Int.
			Int modulo = firstInt.modulo(secondInt);
			int modulo1 = modulo.getValue();
			System.out.println("Остаток при " + firstInt.getValue() +" / " + secondInt.getValue() + " = " + modulo1 + ".");
			
			scan.close();
		}
}
