package Основы.lesson11_Task1_NewYear;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Travel {

	public static void main(String[] args) throws Exception  {

		GregorianCalendar arriveDay = new GregorianCalendar(2012, 11, 27);
//		arriveDay.set(GregorianCalendar.YEAR, 2012);
//		arriveDay.set(GregorianCalendar.MONTH, GregorianCalendar.DECEMBER);
//		arriveDay.set(GregorianCalendar.DAY_OF_MONTH, 27);

		arriveDay.add(GregorianCalendar.DAY_OF_MONTH, -45);
        
		
		SimpleDateFormat s = new SimpleDateFormat();
        // new Date(System.currentTimeMillis()));
        System.out.println("?????? ???? ???????: "+s.format(arriveDay.get(GregorianCalendar.DAY_OF_MONTH)));
        
        
        
	}

}
