package Основы.HomeWork1;

public class Task0_ZamenaDvuhPeremennihMestami {
	
	/* Объявить 2 переменные целого типа, проинициализировать любыми значениями,
	 * поменять значения переменных местами и вывести на экран.
	 */

	public static void main(String[] args) {
		
		int val1 = 1;
		int val2 = 5;
		int val3 = 0;

		System.out.println("Переменная №1 = " + val1 + "; " + "Переменная №2 = " + val2);
		System.out.println("После изменений:");
		
		val3 = val1;
		val1 = val2;
		val2 = val3;
		
		System.out.println("Переменная №1 = " + val1 + "; " + "Переменная №2 = " + val2);
    }
}
