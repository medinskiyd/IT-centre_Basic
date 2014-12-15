package Основы.lesson14.Task1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		DoublyLinkList list = new DoublyLinkList ();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		
		//list.insert(77, 2);
		
		
		
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(list.isPalindrom());
	}
}
