package ������.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_SumArrayList {
	
	/* ������� ������ ����� ����� �� 10 ���������.
	 * ��������� ����� �������� ������ � ������� �� �����.
	 */

	public static void main(String[] args) {
		ArrayList<Integer> list = 
				new ArrayList <Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++){
			sum = sum + list.get(i);
		}
		
//		int sum1 = 0;
//		for(int el : list) { ���������� ��� � � ���������� �����.
//			sum1+=el;
//		}
		

		System.out.println("C����� �������� ������� "+ list +" = "+ sum + ".");
	}

}
