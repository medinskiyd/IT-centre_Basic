package Основы.lesson15.Task1.Task1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList <Integer> ();
		
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(9);
		
		List first = new List();
		
		System.out.println("Имеем массив: " + list);
		
		first.sort(list, 5);
		
		System.out.println("Отсортированный массив: " + list);
		

	}

}
