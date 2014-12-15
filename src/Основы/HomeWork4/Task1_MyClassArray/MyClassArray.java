package Основы.HomeWork4.Task1_MyClassArray;

public class MyClassArray {
	
	/* Написать класс массив (Не динамический). 
	 * Заполнить значениями.
	 * Написать методы в классе:
	 * - нахождение минимального элемента;
	 * - нахождение максимального элемента;
	 * - Заполнение массива случайными числами в заданом диапазоне;
	 * -(*) частичное упорядочивание (выбрать cредний элемент, расположить его по середине массива,
	 * справа пойдут элементы те что больше этого элемента, слева - те что меньше). 
	 * - красиво вывести на экран [ 2 4 5 6 ]; 
	 * -(*) увеличить размер массива на 1 элемент (использовать создание еще одного массива).
	 */

	private int arrayLength = 100; // Размер массива.
	private int array1Length = 101; // Размер массива1.
	private int newArrayEl; // Элемент массива.
	private int array [] = new int[this.arrayLength]; // Массив.
	private int array1 [] = new int[this.array1Length]; // Массив1.
	private int min = 10000; // Минимальное значение в массиве.
	private int max = 0; // Минимальное значение в массиве.
	int i; // для счетчика.
	
	//Метод записыает размер массива.
	public void setArrayLength(int arrayLength) {
		this.arrayLength = arrayLength;
	}
		
	//Метод возращает размер массива.
	public int getArrayLength() {
		return this.arrayLength;
	}	
	
	//Заполнение массива элементами.
	
	public void setNewArrayEl(int newArrayEl) {
		this.array[i] = newArrayEl;
	}

	//Чтение элемента массива.
	public int getArrayEl() {
		return this.array[i];
	}

	//Метод возращает минимальное значение массива.
	public int getMinEl() {
		for(i = 0; i < this.arrayLength; i++){
			if (min > array[i]) {
				min = array[i];
			}	
		}
		return min;
	}
	
	//Метод возращает максимальное значение массива.
	public int getMaxEl() {
		for(i = 0; i < this.arrayLength; i++){
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	//Метод заполняем массив случайными числами в заданном диапазоне.
	public void randomArray(int diapRandomArray) {
		for(i = 0; i < this.arrayLength; i++){
			array[i] = (int)(Math.random() * diapRandomArray);
		}
	}
	
	//Частичное упорядочивание. (не доделано)
	public void sort (){
		for (int i = 0; i < this.arrayLength; i++) {
			
		}
	}
	
	//Увеличить размер массива на 1 элемент.  (не доделано)
	public void plusElArray (){
		for (int i = 0; i < this.arrayLength; i++) {
			
		}
	}
	
}
