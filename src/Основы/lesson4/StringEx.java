package ������.lesson4;

import java.util.Scanner;

public class StringEx { 
	
	//������.

	public static void main(String[] args) {

		System.out.println("������� ������: ");
		Scanner scan = new Scanner (System.in);
		String str = scan.nextLine();
						
		int len = str.length(); //������ ������.
		int kolOfSymb = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			kolOfSymb = kolOfSymb + 1;
		
		}
		System.out.println(kolOfSymb);
	}

}
