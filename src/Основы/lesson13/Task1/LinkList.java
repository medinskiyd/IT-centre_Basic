package Основы.lesson13.Task1;

public class LinkList {
	
	private Element first; // Первый элемент.
	private int size; // Размер.
	
	public void addFirst (Integer value)	{
	Element newElement = new Element();
	newElement.setNext(first);
	newElement.setValue(value);
	first = newElement;
	size++;
	}
	
	public void addLast(Integer value) {	
		 Element elem = first;
		 while(elem.getNext() != null) {
			 elem = elem.getNext();
		 }
		Element newElement = new Element();
		newElement.setValue(value);
		elem.setNext(newElement);
	}
	
	public Element[] toArray() {
		Element[] result = new Element[size];
		Element elem = first;
		int index  = 0;
		while(elem.getNext() != null) {
			result[index++] = elem;
			elem = elem.getNext();
		}
	result[result.length-1] = elem;
	
	return result;
	}
	
	public void insert(Integer value) {	
		Element newElement = new Element();
		newElement.setNext(first.getNext());
		newElement.setValue(value);
		first.setNext(newElement);
		
	}

}
