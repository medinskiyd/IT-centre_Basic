package Основы.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = 
				new ArrayList <Integer>(Arrays.asList(1,2,3,4));
		
		list.add(100);
		int first = list.get(0); // Получить значение первого элемента.
		list.set(0,200); // Помещение значения в элемента.
		list.add(0,100);//  Вставка элемента (перегруженная версия метода add) (все элем. сдвигаются вправо) 
		list.remove(1); // Удаление 1-го элемента массива (все элем. сдвигаются влево) 
		int index = list.indexOf(100); //Находит позицию первого элемента с таким значением
		int size = list.size();
		System.out.println(list);
	}

}
