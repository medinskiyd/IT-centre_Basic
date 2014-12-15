package ������.HomeWork7.Task0_LinkList;

public class Element implements Comparable<Element> {

	private Integer value; // ��������.
	private Element next; // ������ �� ���������.
	
	public Element(){
		
	}
	
	public Element(Integer value, Element element) {
		this.value = value;
		this.next = element;
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

	@Override // ��� ���� ��� �� ��� �������� ����� ���������� �������������� toString().
	public String toString() {
		if (next != null) {
		return value + "->";
		}
		return value + "";
	}

	@Override // �������������� compareTo �� ��������� �� �����������.
	public int compareTo(Element arg0) { 

		if (this.value > arg0.value) {
			return 1;
		} 
		if (this.value == arg0.value) {
			return 0;
		} 
		if (this.value < arg0.value) {
			return -1;
		} 
		
		return 0;
	}
	
}
