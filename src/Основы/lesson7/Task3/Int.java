package Основы.lesson7.Task3;

	//Создать класс число (Int) с арифметическими методами. Соблюсти инкапсуляцию.

public class Int {
	
	private int value;
	
	//Метод записывает переменной класса значение введенной переменной. 
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	
	//Метод считает сумму 2-х элементов типа Int.
	public Int add(Int v) {
	
		Int res = new Int();
		res.value = value + v.value;
		return res;
	}
	
	//Метод считает умножение 2-х элементов типа Int.
	public Int multip(Int v) {
		
		Int res1 = new Int();
		res1.value = value * v.value;
		return res1;
	}

	//Метод считает деление 2-х элементов типа Int.
	public Int div(Int v) {
			
		Int res2 = new Int();
		res2.value = value / v.value;
		return res2;
	}
}
