package Основы.HomeWork3;

import java.util.Arrays;

public class Task5_ShellSort {
	
	/* Реализовать сортировку методом Шелла (вставка).
	 * 
	 */

		public static void main(String[] args) {

			int vector [] = {2, 4, 5, 12, 6, 3, 8, 9, 1, 10};
			int vectorSort [] = new int[10];
			
			vectorSort = sortShell(vector);
			
				System.out.println("Отсортированый цыкл:");
				System.out.println(Arrays.toString(vectorSort));	
		}
		
		//Сравниваем элементы алгоритмом выбора без доп. массива.
		
	public static int[] sortShell (int [] vector1) {
			
			int i, j, k, h, m=0, b= vector1.length; // Создаем переменные.
			   
			   int[] d = { 1, 4, 10, 23, 57, 145, 356, 911, 1968, 4711, 11969, 27901,
			               84801, 213331, 543749, 1355339, 3501671, 8810089, 21521774,
			               58548857, 157840433, 410151271, 1131376761, 2147483647 };
			  
			   while (d[m] < b) ++m; // Рассчитываем количество элементов m.
			 
			   while (--m >= 0) {
			      k = d[m];
			      
			      for (i=k; i<b; i++){     // k-сортировка
			         j=i;
			         h= vector1[i];
			         while ((j >= k) && ( vector1[j-k] > h)){  
			        	 vector1[j]= vector1[j-k];
			              j =  j-k;
			         }
			         vector1[j] = h;
			      }
			   }
	return vector1;
	}
}



