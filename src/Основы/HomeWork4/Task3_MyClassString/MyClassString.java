package Основы.HomeWork4.Task3_MyClassString;

public class MyClassString {

	/* Написать класс строка (не использовать ничего из String).
	 * (строка - набор чаров)
	 * 
	 * Создать методы:
	 * - создание строки на основе массива символов;
	 * - вывод на экран;
	 * - конкатенация строк;
	 * - понижение регистра (все буквы маленькие);
	 * - повышение регистра (все буквы большие);
	 * - поиск подстроки;
	 * - выделение подстроки (аналог substring);
 	 * - удаление пробелов в строке.
	 */

	private char newArrayEl1; // Символ 1 строки.
	private char newArrayEl2; // Символ 2 строки.
	private int arrayLength1 = 100; // Размер 1 строки.
	private int arrayLength2 = 100; // Размер 2 строки.
	private char string1 [] = new char[this.arrayLength1]; // Строка 1.
	private char string2 [] = new char[this.arrayLength2]; // Строка 2.
	int i; // для счетчика 1.
	
	public char addstring [] = new char[this.arrayLength1 + this.arrayLength2]; // Строка.
	
	
	//Метод записывает размер 1 массива.
	public void setStringLength1(int stringLength) {
		this.arrayLength1 = stringLength;
	}
		
	//Метод возращает размер 1 массива.
	public int getStringLength1() {
		return this.arrayLength1;
	}	
	
	//Заполнение 1 массива элементами.
	public void setNewStringEl1(char newArrayEl) {
		this.string1[i] = newArrayEl;
	}

	//Чтение элемента 1 массива.
	public int getStringEl1() {
		return this.string1[i];
	}

	//Метод записыает размер 2 массива.
	public void setStringLength2(int stringLength) {
		this.arrayLength2 = arrayLength2;
	}
		
	//Метод возращает размер 2 массива.
	public int getStringLength2() {
		return this.arrayLength2;
	}	
	
	//Заполнение 2 массива элементами.
	public void setNewStringEl2(char newArrayEl) {
		this.string2[i] = newArrayEl;
	}

	//Чтение элемента 2 массива.
	public int getStringEl2() {
		return this.string2[i];
	}	

	//Конкатенация строк.
	public void addString () {
		int j=0;
		for (int i = 0; i < (this.arrayLength1 + this.arrayLength2); i++) {
			if (i < this.arrayLength1) {
				this.addstring[i] = this.string1[i];
			}
			if (i >= this.arrayLength1) {
				this.addstring[i] = this.string2[j];
				j++;
			}
		}
	}
	
	//Чтение элемента массива после конкатенации строк.
	public int getStringEl3() {
		return this.addstring[i];
	}	
	
	//Понижение регистра (все буквы маленькие).
	public void downStringSymb () {

		for (int i = 0; i < (this.arrayLength1 + this.arrayLength2); i++) {
			
			if ((int)addstring[i] < 96) {
				int d = (int)addstring[i] + 32;
				addstring[i] = (char)d;
			}
		}
	}
	
	public int getDownStringSymb() {
		return this.addstring[i];
	}	
	
	
}

