package Bridgelabz.third;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */


public class EmpWageBuilderArrayUC14 implements EmpWageBuilderInterface
{
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME= 2;
	private int noOfCompanies = 0;
//	public void incNoOfCompanies() {
//		this.noOfCompanies++;
//	}
	private List<EmpWageChars> empWageCharacters= new ArrayList<EmpWageChars>();
	private Map<String,Integer> companyToWage = new HashMap<String,Integer>();
	
	public void addEmpWageChars(EmpWageChars empWageChars) {
		this.empWageCharacters.add(empWageChars);
		noOfCompanies++;
	}
    
	public static void main( String[] args )
    {
		EmpWageBuilderArrayUC14 compArray = new EmpWageBuilderArrayUC14();
    	EmpWageChars comp1 = new EmpWageChars("Dmart",200,17,100);
    	EmpWageChars comp2 = new EmpWageChars("Amazon",300,15,90);
    	compArray.addEmpWageChars(comp1);
    	compArray.addEmpWageChars(comp2);
    	compArray.calcEmpWage();
    	int k = compArray.getWageFor("Dmart");
    	if(k != 0)
    		System.out.println("The wage for the company Dmart is :"+k);
    }
    
	public void calcEmpWage() {
    	for(int i=0;i<this.noOfCompanies;i++) {
    		this.empWageCharacters.get(i).setTotalEmpWage(this.calcEmpWage(this.empWageCharacters.get(i)));
    		String s1= this.empWageCharacters.get(i).getCompanyName();
    		if(!this.companyToWage.containsKey(s1)) {
    			int l= this.empWageCharacters.get(i).getTotalEmpWage();
    			this.companyToWage.put(s1,l);
    		}
    	}
    }
    
	private int getWageFor(String company) {
		int val=0;
		if(companyToWage.containsKey(company))
			val = companyToWage.get(company);
		else
			System.out.println("The company does not exist;");
		return val;
	}
	
    public int calcEmpWage (EmpWageChars empWageChar) { 
    	int totalWorkingHrs=0;
    	int totalWage=0;
    	int days=0;
    	while(totalWorkingHrs < empWageChar.getMaxHoursPerMonth()     &&    days < empWageChar.getNumOfWorkingDays()) {
    		int noOfHrs = 0;
    		final int empCheck = (int)Math.floor(Math.random() * 10)%3;
    		switch(empCheck) {
    		case IS_FULL_TIME: 	noOfHrs = 8;
    						days += 1;
    						break;
    		case IS_PART_TIME:	noOfHrs = 4;
    						days += 1;
    						break;
    		}
    		totalWorkingHrs += noOfHrs;
    		final int empWage= noOfHrs*empWageChar.getEmpRatePerHour();
    		empWageChar.addDailyWage(empWage);
    		totalWage+=empWage;
    	}
    	if(totalWorkingHrs >= empWageChar.getMaxHoursPerMonth())
    		System.out.println( "Employee's wage for completing " + empWageChar.getMaxHoursPerMonth() + " or more Hrs in "+empWageChar.getCompanyName()+" is " + totalWage);
    	else
    		System.out.println("Employee's wage after working " + empWageChar.getNumOfWorkingDays() + " or more days in "+empWageChar.getCompanyName()+" is "  + totalWage);
    	return totalWage;
    }
}
