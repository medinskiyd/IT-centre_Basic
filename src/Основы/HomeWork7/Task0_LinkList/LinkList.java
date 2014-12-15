package Основы.HomeWork7.Task0_LinkList;

public class LinkList {
	
	// Связанный список.
	
    private Element first; // Первый элемент списка.
    private int size; // Размер списка.

    // Метод добавляет новый элемент и ставит его на первое место.
    public void addFirst(Integer value) {
        Element newElement = new Element();
        newElement.setNext(first); 
        newElement.setValue(value); 
        first = newElement;
        size++;
    }

    // Метод добавляет новый элемент в конец списка.
    public void addLast(Integer value) {
        Element elem = first; // Создаем элемент и ему присваиваем первый элемент.
        while(elem.getNext() != null) { // присваиваем элементы списка нашему элементу пока наш элемент не будет равен последнему. 
            elem = elem.getNext(); 
        }
        Element newElement = new Element(); // Создаем новый элемент.
        newElement.setValue(value); // Присваиваем значение новому элементу.
        elem.setNext(newElement); // Присваиваем предыдущему элементу ссылку на следующий новосозданный элемент.
        size++;
    }

    // Метод добавляет элемент в список в указанное место.
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

    // Создаем массив из элементов списочного типа.
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
	
    // Метод меняет значение элемента по индексу.
    public void changeElementByIndex(int index, Integer elem){
    	
    	Element temp = first;
    	Element insertElem = new Element();
    	insertElem.setValue(elem);
    	
    	int i = 0;

    	// Изменение первого элемента.
    	if (index == 1) {
    		first.setValue(elem);
    	}
    	// Изменение с 2-го по передпоследний элемент.
    	while (i < index) {

    		Element temp1 = temp; 
    		temp = temp.getNext();
    		
    		if (i == index-2) {
    		insertElem.setNext(temp.getNext());
    		temp1.setNext(insertElem);
    		}	
    		i++;
    		
    	}
    	// Изменение с последнего элемента.
    	while (i < index) {
    		temp = temp.getNext();
    	
    		if (i == index) {
    			temp.setValue(elem);	
    		}
    	}
    }
    
    // Метод удаляет элемент по индексу.
    public void deleteElementByIndex(int index){
    	
    	Element temp = first;
    	
    	int i = 0;

    	// Удаление первого элемента.
    	if (index == 1) {
    		temp = temp.getNext();
    		first = temp;
    		size--;
    	}
    	// Удаление с 2-го по передпоследний элемент.
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

    // Метод ищет элемент по значению (сравнение через equals).
    public int findElementByValue(Integer elem){
    	
    	 Element elem1 = first; 
    	 int i = 0;
         while(elem1.getValue() != elem) {
        	 elem1 = elem1.getNext(); 
        	 i++;
         }
         return i+1;
    }
    
    // Метод меняет местами первый и последний элементы.
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

    // Метод перестраивает элементы в списке в обратном порядке. (не работает).
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

    // Метод меняет местами наибольший и наименьший элементы, в случае если реализован интерфейс Comparable.
}
