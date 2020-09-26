package Bridgelabz.third;

import java.util.ArrayList;
import java.util.List;

public class EmpWageChars{
	final private String companyName;
	final private int empRatePerHour;
	final private int maxHoursPerMonth;
	final private int numOfWorkingDays;
	private List<Integer> dailyWage = new ArrayList<Integer>();
	public int getMaxHoursPerMonth() {
		return maxHoursPerMonth;
	}
	public int getNumOfWorkingDays() {
		return numOfWorkingDays;
	}
	public int getEmpRatePerHour() {
		return empRatePerHour;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void addDailyWage(int dailyWage) {
		this.dailyWage.add(dailyWage);
	}
	public List<Integer> getDailyWage(){
		return this.dailyWage;
	}
	private int totalEmpWage;
	public EmpWageChars(String companyName, int empRatePerHour, int numOfWorkingDays,
	    	int maxHoursPerMonth) {
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
		this.companyName = companyName;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	public int getTotalEmpWage() {
		return this.totalEmpWage;
	}
}