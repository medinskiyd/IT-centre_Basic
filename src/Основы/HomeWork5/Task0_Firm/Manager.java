package Основы.HomeWork5.Task0_Firm;

public class Manager extends Worker {

	// Стандартный конструктор.
	public Manager () {
		
	}
	// Конструктор с параметрами.
	public Manager (String surname, String name, String patronymic, Gender gender, int dayOfBirth, int monthOfBirth,
			int yearOfBirth, double wageRate, double salaryAccount, int experience, int vacationDays, 
			int dayOfLastVacation,int monthOfLastVacation, int yearOfLastVacation , String department, 
			int people) {
		
		setSurname(surname);
		setName(name);
		setPatronymic(patronymic);
		setGender(gender);
		setDayOfBirth(dayOfBirth);
		setMonthOfBirth(monthOfBirth);
		setYearOfBirth(yearOfBirth);
		setWageRate(wageRate);
		setSalaryAccount(salaryAccount);
		setExperience(experience);
		setVacationDays(vacationDays);
		setDayOfLastVacation(dayOfLastVacation);
		setMonthOfLastVacation(monthOfLastVacation);
		setYearOfLastVacation(yearOfLastVacation);
		setDepartment(department);
		this.people = people;
		
	}
	
	private int people;
	private double managerSalary;
	
	// Возвращает количетво подчиненных.
	public int getPeople() {
		return people;
	}
	// Записывает количество подчиненных.
	public void setPeople(int people) {
		this.people = people;
	}
	// Возвращает зарплату с надбавкой.
	public double getManagerSalary() {
		return managerSalary;
	}
	// Записывает зарплату с надбавкой.
	public void setManagerSalary(double wageRate) {
		this.managerSalary = (this.people * 50) + wageRate;
	}
	
}
