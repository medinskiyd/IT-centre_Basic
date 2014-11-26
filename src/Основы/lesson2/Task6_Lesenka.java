package Основы.lesson2;

/* Нарисовать лесенку:
 * 
 *         *
 *         **
 *         ***
 *    
 */

public class Task6_Lesenka {

	public static void main(String[] args) {
		
		String c = "*";
		String b = "*";
		
		for (int i = 0; i < 3; i++) { // Цикл до 3-х.
			
			System.out.println(c);
			
			c = c + b;
			
			
		}

	}

}
