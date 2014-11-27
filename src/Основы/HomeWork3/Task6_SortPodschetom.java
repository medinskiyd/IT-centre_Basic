package Основы.HomeWork3;

import java.util.Arrays;

public class Task6_SortPodschetom {

	/* Реализовать сортировку методом подсчета.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int vector [] = {2, 4, 44, 12, 6, 3, 8, 9, 1, 10};
		int vectorSort [] = new int[10];
		
		vectorSort = sortPodschetom(vector);
		
			System.out.println("Отсортированый цыкл:");
			System.out.println(Arrays.toString(vectorSort));	

	}
	
	public static int[] sortPodschetom (int [] vector1) {
		
		int i, j, newValue;
		int co = 0;
		int ch = 0;
        for (i = 1; i < vector1.length; i++)
        {
            newValue = vector1[i];
            j = i;
            while (j > 0 && vector1[j - 1] > newValue)
            {
                co++;
                vector1[j] = vector1[j - 1];
                j--;
            }
 
            ch++;
            vector1[j] = newValue;
        }
		   return vector1;
	}
}
