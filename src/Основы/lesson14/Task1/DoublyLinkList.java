package Основы.lesson14.Task1;

public class DoublyLinkList {

	private Element first; // Первый элемент.
	private int size; // Размер.
	private Element last; // Аоследний элемент.
	
	public void addFirst (Integer value)	{
	Element newElement = new Element();
	newElement.setNext(first);
	newElement.setValue(value);
	
	if(first != null) {
		first.setPrev(newElement);
	} else {
		last = newElement;
	}

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
	
	public void insert(Integer value, Integer prevValue) {	
		Element newElement = new Element();
		
		Element elem = first;
		while(elem.getValue() == prevValue) {
			
			newElement.setValue(value);
			newElement.setNext(elem.getNext());
			newElement.setPrev(elem);
			elem.getNext().setPrev(newElement);
			elem.setNext(newElement);
			
		 }
	}
	
	public boolean isPalindrom() {
		Element forward = first;
		int forwardIndex = 0;
		Element backward = last;
		int backwardIndex = size - 1;
		
		 while(forwardIndex < backwardIndex) {
	        if(!forward.getValue().equals(backward.getValue())) {
	            return false;
	        }
	        forwardIndex++;
	        backwardIndex--;
		 }
	     return true;
	 
	}
}

