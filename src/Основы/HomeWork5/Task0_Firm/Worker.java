package ������.HomeWork5.Task0_Firm;

public class Worker {

	// ����������� �����������.
	public Worker (){
		
	}
	
	// ����������� � �����������.
	public Worker (String surname, String name, String patronymic, Gender gender, int dayOfBirth, int monthOfBirth,
			int yearOfBirth, double wageRate, double salaryAccount, int experience, int vacationDays, 
			int dayOfLastVacation,int monthOfLastVacation, int yearOfLastVacation , String department) {
		
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.gender = gender;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.wageRate = wageRate;
		this.salaryAccount= salaryAccount;
		this.experience = experience;
		this.vacationDays = vacationDays;
		this.dayOfLastVacation = dayOfLastVacation;
		this.monthOfLastVacation = monthOfLastVacation;
		this.yearOfLastVacation = yearOfLastVacation;
		this.department = department;
	}

	private String surname; // �������.
	private String name; // ���.
	private String patronymic; // ��������.
	private Gender gender; // ��� (�������, �������).
	private int dayOfBirth; // ���� ��������.
	private int monthOfBirth; // ����� ��������.
	private int yearOfBirth; // ��� ��������.
	private double wageRate; // ������ ��������.
	private double salaryAccount; // ���������� ����.
	private int experience; // ����.
	private int vacationDays; // ���������� ���� �������.
	private int dayOfLastVacation;
	private int monthOfLastVacation;
	private int yearOfLastVacation;
	private String department; // �����.
	
	
	// ���������� ������� ����������.
	public String getSurname() {
		return surname;
	}
	// ���������� ������� ����������.
	public void setSurname(String surname) {
		this.surname = surname;
	}
	// ���������� ��� ����������.
	public String getName() {
		return name;
	}
	// ���������� ��� ����������.
	public void setName(String name) {
		this.name = name;
	}
	// ���������� �������� ����������.
	public String getPatronymic() {
		return patronymic;
	}
	// ���������� �������� ����������.
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	// ���������� ��� ����������.
	public Gender getGender() {
		return gender;
	}
	// ���������� ��� ����������.
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public int getMonthOfBirth() {
		return monthOfBirth;
	}
	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	// ���������� ������ ��������.
	public double getWageRate() {
		return wageRate;
	}
	// ���������� ������ ��������.
	public void setWageRate(double wageRate) {
		this.wageRate = wageRate;
	}
	// ���������� ���������� ����.
	public double getSalaryAccount() {
		return salaryAccount;
	}
	// ���������� ���������� ����.
	public void setSalaryAccount(double salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	// ���������� ���� ������.
	public int getExperience() {
		return experience;
	}
	// ���������� ���� ������.
	public void setExperience(int experience) {
		this.experience = experience;
	}
	// ���������� ��� �������.
	public int getVacationDays() {
		return vacationDays;
	}
	// ���������� ��� �������.
	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public int getDayOfLastVacation() {
		return dayOfLastVacation;
	}

	public void setDayOfLastVacation(int dayOfLastVacation) {
		this.dayOfLastVacation = dayOfLastVacation;
	}

	public int getMonthOfLastVacation() {
		return monthOfLastVacation;
	}

	public void setMonthOfLastVacation(int monthOfLastVacation) {
		this.monthOfLastVacation = monthOfLastVacation;
	}

	public int getYearOfLastVacation() {
		return yearOfLastVacation;
	}

	public void setYearOfLastVacation(int yearOfLastVacation) {
		this.yearOfLastVacation = yearOfLastVacation;
	}

	// ���������� �����.
	public String getDepartment() {
		return department;
	}
	// ���������� �����.
	public void setDepartment(String department) {
		this.department = department;
	}

	// ��������� ������� ��������.
	public void receiveSalaries (){
		
	}

	
	
}
