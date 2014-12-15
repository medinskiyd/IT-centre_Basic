package Основы.Sort;

// Сортировка выбором.

public class SortViborom {

	public static void main(String[] args) {

		int vector[] = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
		
		for (int i = 0; i < vector.length; i++) {
			int min = vector[i];
			int imin = i;	
			for (int j = i+1; j < vector.length; j++) {
				if (vector[j] < min) {
		            min = vector[j];
		            imin = j;
		        }
			}
		    if (i != imin) {
		        int temp = vector[i];
		        vector[i] = vector[imin];
		        vector[imin] = temp;
		    }
			System.out.print(vector[i] + " ");
		}
	}
}
