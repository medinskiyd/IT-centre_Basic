package Основы.HomeWork5.Task0_Firm;

public class Worker {

	// Стандартный конструктор.
	public Worker (){
		
	}
	
	// Конструктор с параметрами.
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

	private String surname; // Фамилия.
	private String name; // Имя.
	private String patronymic; // Отчество.
	private Gender gender; // Пол (Мужской, Женский).
	private int dayOfBirth; // День рождения.
	private int monthOfBirth; // Месяц рождения.
	private int yearOfBirth; // Год рождения.
	private double wageRate; // Ставка зарплаты.
	private double salaryAccount; // Зарплатный счет.
	private int experience; // Стаж.
	private int vacationDays; // Количество дней отпуска.
	private int dayOfLastVacation;
	private int monthOfLastVacation;
	private int yearOfLastVacation;
	private String department; // Отдел.
	
	
	// Возвращает фамилию сотрудника.
	public String getSurname() {
		return surname;
	}
	// Записывает фамилию сотрудника.
	public void setSurname(String surname) {
		this.surname = surname;
	}
	// Возвращает имя сотрудника.
	public String getName() {
		return name;
	}
	// Записывает имя сотрудника.
	public void setName(String name) {
		this.name = name;
	}
	// Возвращает отчество сотрудника.
	public String getPatronymic() {
		return patronymic;
	}
	// Записывает отчество сотрудника.
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	// Возвращает пол сотрудника.
	public Gender getGender() {
		return gender;
	}
	// Записывает пол сотрудника.
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
	// Возвращает ставку зарплаты.
	public double getWageRate() {
		return wageRate;
	}
	// Записывает ставку зарплаты.
	public void setWageRate(double wageRate) {
		this.wageRate = wageRate;
	}
	// Возвращает зарплатный счет.
	public double getSalaryAccount() {
		return salaryAccount;
	}
	// Записывает зарплатный счет.
	public void setSalaryAccount(double salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	// Возвращает стаж работы.
	public int getExperience() {
		return experience;
	}
	// Записывает стаж работы.
	public void setExperience(int experience) {
		this.experience = experience;
	}
	// Возвращает дни отпуска.
	public int getVacationDays() {
		return vacationDays;
	}
	// Записывает дни отпуска.
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

	// Возвращает отдел.
	public String getDepartment() {
		return department;
	}
	// Записывает отдел.
	public void setDepartment(String department) {
		this.department = department;
	}

	// Получение размера зарплаты.
	public void receiveSalaries (){
		
	}

	
	
}
