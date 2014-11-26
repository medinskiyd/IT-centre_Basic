package Основы.HomeWork1;

import java.util.Scanner;

public class Task5_KvadratnoeUravnenie {
	
	/* Решение квадратного уровнения. При заданных коэффициентах найти х.
	 * Предусмотреть 3 варианта.
	 */

	public static void main(String[] args) {

        int firstKoef = 0;
        int secondKoef = 0;
        int thirdKoef = 0;
        int diskriminant = 0;
        Scanner scan = new Scanner(System.in);

		System.out.println("Введите 3 значения коэффициентов квадратного уровнения (первое значение не должно быть равно 0):");

		firstKoef = scan.nextInt(); // Ввод первого коэффициента а.
		secondKoef = scan.nextInt(); // Ввод второго коэффициента b.
		thirdKoef = scan.nextInt(); // Ввод третьего коэффициента c.

		scan.close();

		if (firstKoef == 0) {
			System.out.println("Ошибка ввода."); // Проверка на ошибку, если а = 0.
			return;
		}
		
		diskriminant = secondKoef * secondKoef - 4 * firstKoef * thirdKoef; // Вычисляем дискриминант D = b*b-4ac.
		
		if (diskriminant > 0) {
			double x1 = ((-1 * secondKoef) + Math.sqrt(diskriminant)) / (2 * firstKoef);
			double x2 = ((-1 * secondKoef) - Math.sqrt(diskriminant)) / (2 * firstKoef);
			System.out.println("Корни квадратного уровнения x1 = " + x1 + "; x2 = " + x2 + ".");
		} else if (diskriminant < 0) {
			System.out.println("Корней на множестве действительных чисел нет.");
		} else if (diskriminant == 0) {
			int x = (-1 * secondKoef) / (2 * firstKoef);
			System.out.println("Корни квадратного уровнения x1 = x2 = " + x + ".");
		}
	}
}
