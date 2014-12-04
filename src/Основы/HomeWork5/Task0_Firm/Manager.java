package ������.HomeWork5.Task0_Firm;

public class Manager extends Worker {

	// ����������� �����������.
	public Manager () {
		
	}
	// ����������� � �����������.
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
	
	// ���������� ��������� �����������.
	public int getPeople() {
		return people;
	}
	// ���������� ���������� �����������.
	public void setPeople(int people) {
		this.people = people;
	}
	// ���������� �������� � ���������.
	public double getManagerSalary() {
		return managerSalary;
	}
	// ���������� �������� � ���������.
	public void setManagerSalary(double wageRate) {
		this.managerSalary = (this.people * 50) + wageRate;
	}
	
}
