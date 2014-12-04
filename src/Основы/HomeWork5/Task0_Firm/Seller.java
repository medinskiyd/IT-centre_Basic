package ������.HomeWork5.Task0_Firm;

public class Seller extends Worker    {

	// ����������� �����������.
	public Seller () {
		
	}
	
	// ����������� � �����������.
		public Seller (String surname, String name, String patronymic, Gender gender, int dayOfBirth, int monthOfBirth,
				int yearOfBirth, double wageRate, double salaryAccount, int experience, int vacationDays, 
				int dayOfLastVacation,int monthOfLastVacation, int yearOfLastVacation , String department, 
				double sell) {
			
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
			this.sell = sell;
			
		}
	
	private double sell;
	private double sellerSalary;
	
	// ���������� ������� � double.
	public double getSell() {
		return sell;
	}
	// ���������� ������� � double.
	public void setSell(double sell) {
		this.sell = sell;
	}
	
	// ���������� ������ �������� + �������.
	public double getSellerSalary() {
		return sellerSalary;
	}
	// ���������� ������ �������� + �������.
	public void setSellerSalary(double wageRate) {
		this.sellerSalary = (this.sell * 0.3) + wageRate;
	}
	
}
