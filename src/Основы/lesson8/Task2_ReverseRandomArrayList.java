package ������.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2_ReverseRandomArrayList {
	
	/* ������� ������, ��������� ��� ���������� ���������� �� 0 �� 10.
	 * ������� �������� ������ � �������� �������.
	 */

	public static void main(String[] args) {
		ArrayList<Integer> list = 
				new ArrayList <Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
		int random = 0;
		for (int i = 0; i < list.size(); i++){
			
			random = ((int) (Math.random()*10));
			list.set(i,random);
		}
		
			System.out.println("����� ������: " + list);
			
		for (int i = list.size(); i >= 0; i--){
			
			int first = list.get(list.size()-i);
			list.remove(list.size()-i-1);
			
			list.add(list.size()-i-1,first);

			
			
		}
		System.out.println("���������� ������: " + list);
	}
} // ��������
