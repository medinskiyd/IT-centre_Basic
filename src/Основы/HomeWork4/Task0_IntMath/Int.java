package Основы.HomeWork4.Task0_IntMath;

/* Создать класс число (Int) с арифметическими методами:
 * 
 * Создать методы:
 * - сложение;
 * - вычитание;
 * - деление;
 * - умножение;
 * - возведение в степень;
 * - вычисление факториала;
 * - вычисление остатка от деления.
 * Соблюсти инкапсуляцию.
 *
 */

public class Int {

private int value;

//Метод записывает переменной класса значение введенной переменной. 
public void setValue(int value) {
	this.value = value;
}

//Метод возращает значение переменной value.
public int getValue() {
	return this.value;
}

//Метод считает сумму 2-х элементов типа Int.
public Int add(Int v) {

	Int res = new Int();
	res.value = value + v.value;
	return res;
}

//Метод считает разницу 2-х элементов типа Int.
public Int diff(Int v) {

	Int res1 = new Int();
	res1.value = value - v.value;
	return res1;
}

//Метод считает умножение 2-х элементов типа Int.
public Int multip(Int v) {
	
	Int res2 = new Int();
	res2.value = value * v.value;
	return res2;
}

//Метод считает деление 2-х элементов типа Int.
public Int div(Int v) {
		
	Int res3 = new Int();
	res3.value = value / v.value;
	return res3;
}

//Метод считает возведение первого числа в степень который равен второму числу типа Int.
public Int pow(Int v) {
		
	Int res4 = new Int();
	res4.value = (int)(Math.pow(value, v.value));
	return res4;
	
}

//Метод считает факториал первого числа типа Int.
public Int fact(Int v) {
	
	Int res5 = new Int();
	Int resIn = new Int();
	resIn.value = 1;

	for(int i = 1; i <= value; i++) {
		resIn.value = resIn.value * i; // n! = (n-1)!n  Example: 5! = 1*2*3*4*5.		
	}
	res5.value = resIn.value;
	return res5;
}

//Метод считает остаток от деления первого числа типа Int на второе число типа Int.
public Int modulo(Int v) {
	
	Int res6 = new Int();
	res6.value = value % v.value;
	return res6;
}


}
