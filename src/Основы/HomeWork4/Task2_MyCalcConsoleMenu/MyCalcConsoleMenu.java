package ������.HomeWork4.Task2_MyCalcConsoleMenu;

public class MyCalcConsoleMenu {
	
	/* ����� ����������� � ���� ����������� ����.
	 * 
	 * ������� ������:
	 * - ��������;
	 * - ���������;
	 * - ���������;
	 * - �������.
	 * 
	 * ������ ����������� ����.
	 * �������� ����� �������� ������� �� ������ �� ���������������:
	 * (1.��������. 2.���������. 3.���������. 4.�������.)
	 * ����� ������ �������� ��� ������ ������ �����.
	 * 
	 */
	
	private int value1;
	private int value2;
	private int sum;
	private int sub;
	private int multip;
	private int div;
	
	//����� ���������� ��������� �������� �� ���� � ���������� ������. 
	public void setValue(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	//����� ������ ������ ����������.
	public int getValue1() {
		return this.value1;
	}
	
	//����� ������ ������ ����������.
	public int getValue2() {
		return this.value2;
	}

	//����� ������� 2 �����.
	public int add() {
		sum = this.value1 + this.value2;
		return this.sum; 
	}
	
	//����� �������� 2 �����.
	public int sub() {
		sub = this.value1 - this.value2;
		return this.sub; 
	}
	
	//����� �������� 2 �����.
	public int multip() {
		multip = this.value1 * this.value2;
		return this.multip; 
	}
	
	//����� ����� 2 �����.
	public int div() {
		div = this.value1 / this.value2;
		return this.div; 
	}

}
