package Основы.HomeWork5.Task0_Firm;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
	Scanner scan = new Scanner(System.in);
		
	// Создаем нашу фирму.
	Firm firm = new Firm();
	firm.createEmployees();
	
	System.out.println("Введите размер счета фирмы:");
	firm.setAccount(scan.nextDouble());
		
	System.out.println("Введите номер действия которое вам нужно выполнить:");
	System.out.println("0. Вывести всех сотрудников на экран.");
	System.out.println("1. Вывести всех сотрудников на экран отсортированных по зп.");
	System.out.println("2. Вывести всех сотрудников, отсортированных по фамилии.");
	System.out.println("3. Продавцам продать на сумму 10000.");
	System.out.println("4. Выдать всем зарплату (если не хватает, выдать сколько есть).");
	System.out.println("5. Пересчитать всем отпуска (после 6 мес, по 2 дня в месяц).");
	System.out.println("6. Поднять жалование на 10% всем сотрудникам со стажем > 5 лет.");
	System.out.println("7. Выдать праздничный бонус 20% (если сегодня 8 марта - женщинам, если 23 февраля мужчинам).");
	System.out.println("8. Уволить всех со стажем < 6 мес и нечетной датой рождения, зарплату увольняемого разделить между всеми коллегами по отделу.");
	System.out.println();

	int numAction = scan.nextInt();
		
	// Вывести всех сотрудников на экран.
	if (numAction == 0) {
		firm.outAllEmployees();	
	}
	
	// Вывести всех сотрудников, отсортированных по зп.
	if (numAction == 1) {
		firm.outAllWorkersSortSalary();
	}
	
	// Вывести всех сотрудников, отсортированных по фамилии.
	if (numAction == 2) {	
		firm.outAllWorkersSortSurname();
	}
	
	// Продавцам продать на сумму 10000.
	if (numAction == 3) {	
		firm.sellerSell10000();
	}
	
	// Выдать всем зарплату (если не хватает, выдать сколько есть).
	if (numAction == 4) {	
		firm.salaryForEvery();
	}
	
	// Пересчитать всем отпуска (после 6 мес, по 2 дня в месяц).
	if (numAction == 5) {
		firm.countHoliday();	
	}
	
	// Поднять жалование на 10% всем сотрудникам со стажем > 5 лет.
	if (numAction == 6) {
		firm.raiseSalary5YearsExperience();	
	}
	
	// Выдать праздничный бонус 20% (если сегодня 8 марта - женщинам, если 23 февраля мужчинам).
	if (numAction == 7) {
		firm.bonusMarch8February23();
	}
	 
	// Уволить всех со стажем < 6 мес и нечетной датой рождения, зарплату увольняемого
	// разделить между всеми коллегами по отделу.
	if (numAction == 8) {
		firm.accordingDismissSelection();	
	}

	// Нанять сотрудника, и снимает  с зарплаты сотрудников отдела зарплату новичка.
	if (numAction == 9) {
		firm.hireEmployee();
	}

	// Обработанные данные записываются в файл.
	firm.writeFile();
	
		scan.close();
	}
}
