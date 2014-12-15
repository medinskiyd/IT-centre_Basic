package Основы.lesson13.Task1;

public class Element {
	
		private Integer value; // Значение.
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
		
		@Override // для того что бы был красивый вывод желательно переопределять toString();
		public String toString() {
			//return "Element [value=" + value + ", next=" + next + "]";
			return value + "->";
		}
	
		
	
}
