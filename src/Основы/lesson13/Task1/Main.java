package Основы.lesson13.Task1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		LinkList list = new LinkList ();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(6);
		
		// list.insert(8); // Добавляем в начало элемент. 
		// list.insert(77); // Добавляем элемент.
		
		System.out.println(Arrays.toString(list.toArray()));
		
		
		
		// Анонимный класс.
		Runnable run = new Runnable (){
			
			private double dob;
			@Override
			public void run() {
			}
		};

		run.run();
	}

}
