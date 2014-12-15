package Основы.HomeWork4.Task2_MyCalcConsoleMenu;

public class MyCalcConsoleMenu {
	
	/* Пишем калькулятор в виде консольного меню.
	 * 
	 * Создать методы:
	 * - сложение;
	 * - вычитание;
	 * - умножение;
	 * - деление.
	 * 
	 * Пример консольного меню.
	 * Сделайте выбор операции которой вы хотели бы воспользоваться:
	 * (1.Сложение. 2.Вычитание. 3.Умножение. 4.Деление.)
	 * После выбора операции нас просят ввести числа.
	 * 
	 */
	
	private int value1;
	private int value2;
	private int sum;
	private int sub;
	private int multip;
	private int div;
	
	//Метод записывает введенные значения из мейн в переменные класса. 
	public void setValue(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	//Метод читает первую переменную.
	public int getValue1() {
		return this.value1;
	}
	
	//Метод читает вторую переменную.
	public int getValue2() {
		return this.value2;
	}

	//Метод плюсует 2 числа.
	public int add() {
		sum = this.value1 + this.value2;
		return this.sum; 
	}
	
	//Метод минусует 2 числа.
	public int sub() {
		sub = this.value1 - this.value2;
		return this.sub; 
	}
	
	//Метод умножает 2 числа.
	public int multip() {
		multip = this.value1 * this.value2;
		return this.multip; 
	}
	
	//Метод делит 2 числа.
	public int div() {
		div = this.value1 / this.value2;
		return this.div; 
	}

}
