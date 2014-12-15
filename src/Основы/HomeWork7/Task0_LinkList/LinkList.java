package ������.HomeWork7.Task0_LinkList;

public class LinkList {
	
	// ��������� ������.
	
    private Element first; // ������ ������� ������.
    private int size; // ������ ������.

    // ����� ��������� ����� ������� � ������ ��� �� ������ �����.
    public void addFirst(Integer value) {
        Element newElement = new Element();
        newElement.setNext(first); 
        newElement.setValue(value); 
        first = newElement;
        size++;
    }

    // ����� ��������� ����� ������� � ����� ������.
    public void addLast(Integer value) {
        Element elem = first; // ������� ������� � ��� ����������� ������ �������.
        while(elem.getNext() != null) { // ����������� �������� ������ ������ �������� ���� ��� ������� �� ����� ����� ����������. 
            elem = elem.getNext(); 
        }
        Element newElement = new Element(); // ������� ����� �������.
        newElement.setValue(value); // ����������� �������� ������ ��������.
        elem.setNext(newElement); // ����������� ����������� �������� ������ �� ��������� ������������� �������.
        size++;
    }

    // ����� ��������� ������� � ������ � ��������� �����.
    public void insert(int position, Integer elem){
    	
    	Element temp = first;
    	Element insertElem = new Element();
    	insertElem.setValue(elem);
    	
    	int i = 0;
    	while (i <= position-2) {
    		
    		if (i == position-2) {
    		insertElem.setNext(temp.getNext());
    		temp.setNext(insertElem);
    		}
    		temp = temp.getNext();
    		i++;
    	}
    	size++;
    }

    // ������� ������ �� ��������� ���������� ����.
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
	
    // ����� ������ �������� �������� �� �������.
    public void changeElementByIndex(int index, Integer elem){
    	
    	Element temp = first;
    	Element insertElem = new Element();
    	insertElem.setValue(elem);
    	
    	int i = 0;

    	// ��������� ������� ��������.
    	if (index == 1) {
    		first.setValue(elem);
    	}
    	// ��������� � 2-�� �� �������������� �������.
    	while (i < index) {

    		Element temp1 = temp; 
    		temp = temp.getNext();
    		
    		if (i == index-2) {
    		insertElem.setNext(temp.getNext());
    		temp1.setNext(insertElem);
    		}	
    		i++;
    		
    	}
    	// ��������� � ���������� ��������.
    	while (i < index) {
    		temp = temp.getNext();
    	
    		if (i == index) {
    			temp.setValue(elem);	
    		}
    	}
    }
    
    // ����� ������� ������� �� �������.
    public void deleteElementByIndex(int index){
    	
    	Element temp = first;
    	
    	int i = 0;

    	// �������� ������� ��������.
    	if (index == 1) {
    		temp = temp.getNext();
    		first = temp;
    		size--;
    	}
    	// �������� � 2-�� �� �������������� �������.
    	while (i < index ) {

    		Element temp1 = temp; 
    		temp = temp.getNext();
    		if (i == index-2) {
    			temp1.setNext(temp.getNext());
    			temp.setNext(null);
    			size--;
    		}	
    		i++;
    	}
    }

    // ����� ���� ������� �� �������� (��������� ����� equals).
    public int findElementByValue(Integer elem){
    	
    	 Element elem1 = first; 
    	 int i = 0;
         while(elem1.getValue() != elem) {
        	 elem1 = elem1.getNext(); 
        	 i++;
         }
         return i+1;
    }
    
    // ����� ������ ������� ������ � ��������� ��������.
    public void changeFirstAndLastElement(){
    	
    	Element elem = first; 
        while(elem.getNext() != null) { 
            elem = elem.getNext(); 
        }
        Element newElement = new Element();
        elem.setNext(newElement);
        size++;

    	newElement.setValue(elem.getValue());
    	elem.setValue(first.getValue());
    	first.setValue(newElement.getValue());
    	elem.setNext(null);
    	size--;
    }

    // ����� ������������� �������� � ������ � �������� �������. (�� ��������).
    public void reverseElements(){ 
    	
    	Element elem = first;
    	Element elem1 = first;
        while(elem.getNext() != null) { 
        	
        	while(elem1.getNext() != elem.getNext()) { 
        		elem1 = elem1.getNext();
        	}
        	
        	elem.setValue(elem1.getValue());
        	elem = elem.getNext();
        }
        
        
       // size++;
    	
    }

    // ����� ������ ������� ���������� � ���������� ��������, � ������ ���� ���������� ��������� Comparable.
}
