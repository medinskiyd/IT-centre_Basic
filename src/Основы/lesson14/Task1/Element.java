package ������.lesson14.Task1;

public class Element {

	private Integer value; // ��������.
	private Element next; // ������ �� ���������.
	private Element prev; //������ �� ����������.
	
	public Element(){
		
	}
	
	public Element(Integer value, Element element, Element prevElement) {
		this.value = value;
		this.next = element;
		this.prev = prevElement;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}
	
	public Element getPrev() {
		return prev;
	}

	public void setPrev(Element prev) {
		this.prev = prev;
	}

	@Override // ��� ���� ��� �� ��� �������� ����� ���������� �������������� toString();
	public String toString() {
		//return "Element [value=" + value + ", next=" + next + "]";
		return value + "->";
	}

}
