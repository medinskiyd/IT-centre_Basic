package Основы.Sort;

// Сортировка методом пузырька.
//Работает не до конца

public class SortBubble { 

		public static void main(String[] args) {

			int vector[] = {2, 1, 4, 3, 6, 5, 8, 7, 10, 9};
			
			for (int i = vector.length-1; i >=2; i--) {
			
				boolean sorted = true;
		
				for (int j = 0; j < i; j++) {
					if (vector[j] < vector[j+1]) {
			            
						int temp = vector[j];
						vector[j] = vector[j+1];
						vector[j+1] = temp;
						sorted = false;
			        }
				}
			    if (sorted) {
			       break;
			    }
				System.out.print(vector[i] + " ");
			}
		}

	}
