package ������.HomeWork4.Task3_MyClassString;

public class MyClassString {

	/* �������� ����� ������ (�� ������������ ������ �� String).
	 * (������ - ����� �����)
	 * 
	 * ������� ������:
	 * - �������� ������ �� ������ ������� ��������;
	 * - ����� �� �����;
	 * - ������������ �����;
	 * - ��������� �������� (��� ����� ���������);
	 * - ��������� �������� (��� ����� �������);
	 * - ����� ���������;
	 * - ��������� ��������� (������ substring);
 	 * - �������� �������� � ������.
	 */

	private char newArrayEl1; // ������ 1 ������.
	private char newArrayEl2; // ������ 2 ������.
	private int arrayLength1 = 100; // ������ 1 ������.
	private int arrayLength2 = 100; // ������ 2 ������.
	private char string1 [] = new char[this.arrayLength1]; // ������ 1.
	private char string2 [] = new char[this.arrayLength2]; // ������ 2.
	int i; // ��� �������� 1.
	
	public char addstring [] = new char[this.arrayLength1 + this.arrayLength2]; // ������.
	
	
	//����� ���������� ������ 1 �������.
	public void setStringLength1(int stringLength) {
		this.arrayLength1 = stringLength;
	}
		
	//����� ��������� ������ 1 �������.
	public int getStringLength1() {
		return this.arrayLength1;
	}	
	
	//���������� 1 ������� ����������.
	public void setNewStringEl1(char newArrayEl) {
		this.string1[i] = newArrayEl;
	}

	//������ �������� 1 �������.
	public int getStringEl1() {
		return this.string1[i];
	}

	//����� ��������� ������ 2 �������.
	public void setStringLength2(int stringLength) {
		this.arrayLength2 = arrayLength2;
	}
		
	//����� ��������� ������ 2 �������.
	public int getStringLength2() {
		return this.arrayLength2;
	}	
	
	//���������� 2 ������� ����������.
	public void setNewStringEl2(char newArrayEl) {
		this.string2[i] = newArrayEl;
	}

	//������ �������� 2 �������.
	public int getStringEl2() {
		return this.string2[i];
	}	

	//������������ �����.
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
	
	//������ �������� ������� ����� ������������ �����.
	public int getStringEl3() {
		return this.addstring[i];
	}	
	
	//��������� �������� (��� ����� ���������).
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

