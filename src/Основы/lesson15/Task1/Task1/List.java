package Основы.lesson15.Task1.Task1;

import java.util.ArrayList;

public class List {
	
	void sort(ArrayList <Integer> list, int elem) {
		
		
		int firstPartElem = list.get(0);
		int secondPartElem = list.get(list.size()-1);
		int jI = 0;
		int kI = list.size()-1;
		for (int i = 0; i < list.size(); i++){
			
			for (int j = 0; j < list.size(); j++){
				
				if (list.get(j) > elem) {
					firstPartElem = list.get(j);
					jI++;
				}
			}
			
				for (int k = list.size()-1; k > 0 ; k--){
				
					if (list.get(k) < elem) {
						secondPartElem = list.get(k);
						kI--;
					}
				}
				
				if (firstPartElem != secondPartElem) {
					list.set(jI, secondPartElem);
					list.set(kI, firstPartElem);
				}
		
		}	
	}
}
