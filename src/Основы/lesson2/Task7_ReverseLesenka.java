package Основы.lesson2;

/* Нарисовать лесенку:
 * 
 *         ***
 *          **
 *           *
 *    
 * */

public class Task7_ReverseLesenka {

	public static void main(String[] args) {
		
		String a = "*";
									
		for (int i=0; i < 3; i++) {
			
			System.out.println();
								
			for (int j=0; j < 3; j++) {
			
				if (i == j) {
					
					a = "*";
					
				} else if (i > j) {
					
					a = " ";	
				}
				System.out.print(a);			
			}
		}	
	}
}
