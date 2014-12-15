package Основы.lesson12.Task3_Recurs.Task1_Exception.Task1_Exception;

public class String1 {


	// 
	public boolean checkString(String s) {

		try {
            Integer.valueOf(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
	
	public void checkStringNull(String s) {
	
		try {
			if (s==null) {
				
			}
		} catch (NullPointerException e) {
			System.out.println("Ошибка ввода");
		}
	}
}
