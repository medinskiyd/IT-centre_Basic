package ������.lesson7.Task3;

	//������� ����� ����� (Int) � ��������������� ��������. �������� ������������.

public class Int {
	
	private int value;
	
	//����� ���������� ���������� ������ �������� ��������� ����������. 
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	
	//����� ������� ����� 2-� ��������� ���� Int.
	public Int add(Int v) {
	
		Int res = new Int();
		res.value = value + v.value;
		return res;
	}
	
	//����� ������� ��������� 2-� ��������� ���� Int.
	public Int multip(Int v) {
		
		Int res1 = new Int();
		res1.value = value * v.value;
		return res1;
	}

	//����� ������� ������� 2-� ��������� ���� Int.
	public Int div(Int v) {
			
		Int res2 = new Int();
		res2.value = value / v.value;
		return res2;
	}
}
