package ������.HomeWork4.Task4_MyArrayList;

public class MyArrayList {

	/* �������� ����������� ���������� ArrayList (��� int-�).
	 * 
	 * ������� ������:
	 * - addEl;
	 * - getEl;
	 * - setEl;
	 * - indexOf;
	 * -(*) remove.
	 */
	

	private int newArrayEl; // ������ 1 ������.
	private int arrayLength = 100; // ������ 1 ������.
	private int string [] = new int[this.arrayLength]; // ������.
	int i; // ��� �������� 1.
	private int indexEl; // ������ ��������.
	public int addString [] = new int[this.arrayLength + 1]; // ������ � ����������� ���������.
	public int StringDelEl [] = new int[this.arrayLength]; // ������ � ��������� ���������.
	
	
	//����� ��������� ������ 1 �������.
	public void setStringLength(int stringLength) {
		this.arrayLength = stringLength;
	}
		
	//����� ��������� ������ 1 �������.
	public int getStringLength() {
		return this.arrayLength;
	}	
	
	//���������� �������� ������� ��������.
	public void setEl(int newArrayEl) {
		this.string[i] = newArrayEl;
	}

	//������ �������� �������.
	public int getEl() {
		return this.string[i];
	}

	// ���������� �������� � ������.
	public void addEl (int newEl) {
		for (int i = 0; i < this.arrayLength+1; i++) {
			
			if (i < this.arrayLength) {	
				this.addString[i] = this.string[i];
			}
			if (i == this.arrayLength) {	
				this.addString[this.arrayLength] = newEl;
			}
		}
	}
	
	//������ �������� ������� ����� ���������� ��������.
	public int getEl2() {
		return this.addString[i];
	}	

	// ����� ������� ��������.
	public int indexOf (int el) {
		
		for (int i = 0; i < this.arrayLength+1; i++) {
			
			if (this.addString[i] == el) {	
				this.indexEl = i;
			}
		}
		return this.indexEl;
	}
	
	// ������� ������� ������.
	public void delEl (int NumDelel) {
			
		for (int i = 0; i < this.arrayLength; i++) {
				
			if (i < NumDelel-1) {
				StringDelEl[i] = addString[i];
			} else if (i >= NumDelel-1) {
				StringDelEl[i] = addString[i+1];
			}
		}
	}
	
	//������ �������� ������� ����� �������� ��������.
	public int getAfterDel() {
		return this.StringDelEl[i];
	}	
	
}

