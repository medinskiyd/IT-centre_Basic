package ������.HomeWork4.Task1_MyClassArray;

public class MyClassArray {
	
	/* �������� ����� ������ (�� ������������). 
	 * ��������� ����������.
	 * �������� ������ � ������:
	 * - ���������� ������������ ��������;
	 * - ���������� ������������� ��������;
	 * - ���������� ������� ���������� ������� � ������� ���������;
	 * -(*) ��������� �������������� (������� c������ �������, ����������� ��� �� �������� �������,
	 * ������ ������ �������� �� ��� ������ ����� ��������, ����� - �� ��� ������). 
	 * - ������� ������� �� ����� [ 2 4 5 6 ]; 
	 * -(*) ��������� ������ ������� �� 1 ������� (������������ �������� ��� ������ �������).
	 */

	private int arrayLength = 100; // ������ �������.
	private int array1Length = 101; // ������ �������1.
	private int newArrayEl; // ������� �������.
	private int array [] = new int[this.arrayLength]; // ������.
	private int array1 [] = new int[this.array1Length]; // ������1.
	private int min = 10000; // ����������� �������� � �������.
	private int max = 0; // ����������� �������� � �������.
	int i; // ��� ��������.
	
	//����� ��������� ������ �������.
	public void setArrayLength(int arrayLength) {
		this.arrayLength = arrayLength;
	}
		
	//����� ��������� ������ �������.
	public int getArrayLength() {
		return this.arrayLength;
	}	
	
	//���������� ������� ����������.
	
	public void setNewArrayEl(int newArrayEl) {
		this.array[i] = newArrayEl;
	}

	//������ �������� �������.
	public int getArrayEl() {
		return this.array[i];
	}

	//����� ��������� ����������� �������� �������.
	public int getMinEl() {
		for(i = 0; i < this.arrayLength; i++){
			if (min > array[i]) {
				min = array[i];
			}	
		}
		return min;
	}
	
	//����� ��������� ������������ �������� �������.
	public int getMaxEl() {
		for(i = 0; i < this.arrayLength; i++){
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	//����� ��������� ������ ���������� ������� � �������� ���������.
	public void randomArray(int diapRandomArray) {
		for(i = 0; i < this.arrayLength; i++){
			array[i] = (int)(Math.random() * diapRandomArray);
		}
	}
	
	//��������� ��������������. (�� ��������)
	public void sort (){
		for (int i = 0; i < this.arrayLength; i++) {
			
		}
	}
	
	//��������� ������ ������� �� 1 �������.  (�� ��������)
	public void plusElArray (){
		for (int i = 0; i < this.arrayLength; i++) {
			
		}
	}
	
}
