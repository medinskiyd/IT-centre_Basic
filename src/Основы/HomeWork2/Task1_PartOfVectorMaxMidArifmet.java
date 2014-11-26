package Основы.HomeWork2;

import java.util.Scanner;

/* Вывести в консоль элементы той половины одномерного массива у которой 
среднее арифметическое максимальное.
(Программа раccчитывает целое значение сред.арифм.,
потому при нечетном размере средние арифм. знач. могут быть рассчитаны некоректно).
(среднее арифм. рассчитать в отдельном методе).
 */

public class Task1_PartOfVectorMaxMidArifmet {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int razmer = 0;
        int vector[] = null;

		System.out.println("Введите размер массива: ");
        razmer = scan.nextInt();
        vector = new int [razmer];

		System.out.println("Введите " + razmer + " элементов массива: ");
		for (int i = 0; i < razmer; i++) {
			vector[i] = scan.nextInt();
		}
		
		for (int i = 0; i < razmer; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println(" - ваш массив.");
		
		int numFirstElOfPartVector = 0;
		int numLastElOfPartVector = razmer/2;
		
		int sredArifFirst = summOfElPartOfVector(vector, numFirstElOfPartVector, numLastElOfPartVector);
		System.out.println("Среднее арифметическое 1-й части масcива = " + sredArifFirst + ".");
		
		int numFirstElOfSecondPartVector = razmer/2;
		int numLastElOfSecondPartVector = razmer;
		
		int sredArifSecond = summOfElPartOfVector(vector, numFirstElOfSecondPartVector, numLastElOfSecondPartVector);
		System.out.println("Среднее арифметическое 2-й части массива = " + sredArifSecond + ".");

		if (sredArifFirst > sredArifSecond) {
			System.out.println("Среднее арифметическое 1-й половины массива больше сред. ариф. 2-й половины, "
					+ "потому выводятся значения 2-й половины массива");
			for (int i = numFirstElOfPartVector; i < numLastElOfPartVector; i++) {
				System.out.print(vector [i] + " "); 
			}
		} else if (sredArifFirst < sredArifSecond) {
			System.out.println("Среднее арифметическое 2-й половины массива больше сред. ариф. 1-й половины, "
					+ "потому выводятся значения 2-й половины массива:");
		
					for (int i = numFirstElOfSecondPartVector; i < numLastElOfSecondPartVector; i++) {
						System.out.print(vector [i] + " "); 
					}
				} else if (sredArifFirst == sredArifSecond) {
						System.out.println("Среднее арифметическое 2-й половины массива = сред. ариф. 1-й половины, "
						+ "потому ничего не выводим.");
						}
		scan.close();
	}			
		//Метод возвращает средн. арифм. суммы элементов массива.
		public static int summOfElPartOfVector (int vector1[], int numFirstElOfPartVector1, int numLastElOfPartVector1){
			
			int sum = 0;
			int sredArif1 = 0;

			for (int i = numFirstElOfPartVector1; i < numLastElOfPartVector1; i++) {
				sum = vector1[i] + sum;
			}
			sredArif1 = sum / (numLastElOfPartVector1 - numFirstElOfPartVector1); //Среднее арифметическое.
					
			return sredArif1;
		}
}

