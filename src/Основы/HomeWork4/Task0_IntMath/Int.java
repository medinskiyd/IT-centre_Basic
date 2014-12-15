package ������.HomeWork4.Task0_IntMath;

/* ������� ����� ����� (Int) � ��������������� ��������:
 * 
 * ������� ������:
 * - ��������;
 * - ���������;
 * - �������;
 * - ���������;
 * - ���������� � �������;
 * - ���������� ����������;
 * - ���������� ������� �� �������.
 * �������� ������������.
 *
 */

public class Int {

private int value;

//����� ���������� ���������� ������ �������� ��������� ����������. 
public void setValue(int value) {
	this.value = value;
}

//����� ��������� �������� ���������� value.
public int getValue() {
	return this.value;
}

//����� ������� ����� 2-� ��������� ���� Int.
public Int add(Int v) {

	Int res = new Int();
	res.value = value + v.value;
	return res;
}

//����� ������� ������� 2-� ��������� ���� Int.
public Int diff(Int v) {

	Int res1 = new Int();
	res1.value = value - v.value;
	return res1;
}

//����� ������� ��������� 2-� ��������� ���� Int.
public Int multip(Int v) {
	
	Int res2 = new Int();
	res2.value = value * v.value;
	return res2;
}

//����� ������� ������� 2-� ��������� ���� Int.
public Int div(Int v) {
		
	Int res3 = new Int();
	res3.value = value / v.value;
	return res3;
}

//����� ������� ���������� ������� ����� � ������� ������� ����� ������� ����� ���� Int.
public Int pow(Int v) {
		
	Int res4 = new Int();
	res4.value = (int)(Math.pow(value, v.value));
	return res4;
	
}

//����� ������� ��������� ������� ����� ���� Int.
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

//����� ������� ������� �� ������� ������� ����� ���� Int �� ������ ����� ���� Int.
public Int modulo(Int v) {
	
	Int res6 = new Int();
	res6.value = value % v.value;
	return res6;
}


}
