package ������.lesson13.Task1;

public class Element {
	
		private Integer value; // ��������.
		private Element next;
		
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
		
		@Override // ��� ���� ��� �� ��� �������� ����� ���������� �������������� toString();
		public String toString() {
			//return "Element [value=" + value + ", next=" + next + "]";
			return value + "->";
		}
	
		
	
}
