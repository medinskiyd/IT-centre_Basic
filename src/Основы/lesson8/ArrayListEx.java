package ������.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = 
				new ArrayList <Integer>(Arrays.asList(1,2,3,4));
		
		list.add(100);
		int first = list.get(0); // �������� �������� ������� ��������.
		list.set(0,200); // ��������� �������� � ��������.
		list.add(0,100);//  ������� �������� (������������� ������ ������ add) (��� ����. ���������� ������) 
		list.remove(1); // �������� 1-�� �������� ������� (��� ����. ���������� �����) 
		int index = list.indexOf(100); //������� ������� ������� �������� � ����� ���������
		int size = list.size();
		System.out.println(list);
	}

}
