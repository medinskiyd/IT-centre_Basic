package Основы.Sort;

// Сортировка вставками (до конца не работает).

public class SortInsertion {

	public static void main(String[] args) {

		int vector[] = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
		
		for (int j = 1; j <= vector.length-1; j++) {
			int key = vector[j];	
			for (int i = j-1; i>= 0 && vector[i] < key; i--) {
				vector[i+1] = vector[i];
				vector[i] = key;
		        }
			System.out.print(vector[j] + " ");
		}
	}
}
