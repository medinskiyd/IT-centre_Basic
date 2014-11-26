package Основы.lesson1;

import java.util.Scanner;

public class Task3_InputAndOutputValue {

	/* Пользователь вводит число, вывести на экран это число 2 раза. */

    public static void main(String[] args) {

        System.out.println("Введите число -");

        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();

        System.out.println("Спасибо, " + "Ваше число - " + val + "; Повтор вашего числа - " + val + ";");


    }
}