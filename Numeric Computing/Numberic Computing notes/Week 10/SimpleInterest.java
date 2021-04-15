import java.util.*;
//@author Kush Patel
public class SimpleInterest {
	
	private double principal;
	private double rate;
	private double years;
	private double simpleInterest;
	private double maturityValue;
	//^instance fields for the values for principal, rate, years, simple interest and maturity value - respectively
	
	SimpleInterest(){//constructor that will initialize all instance fields to 0.0
		principal = 0.0;
		rate = 0.0;
		years = 0.0;
		simpleInterest = 0.0;
		maturityValue = 0.0;
	}
	
	SimpleInterest(double pvalue, double rvalue, double tvalue) {//constructor with three parameters, in case all three fields want to be given at once
		principal = pvalue;
		rate = rvalue;
		years = tvalue;
	}
	
	public double getPrincipal() {//accessor method for private field principal
		return principal;
	}
	
	public double getRate() {//accessor method for private field rate
		return rate;
	}
	
	public double getYears() {//accessor method for private field years
		return years;
	}
	
	public double getSimpleInterest() {//accessor method for private field simple interest
		return simpleInterest;
	}
	
	public void setPrincipal(double p) {//mutator method for private field principal 
		principal = p;
	}
	
	public void setRate(double r) {//mutator method for private field rate
		rate = r;
	}
	
	public void setYears(double t) {//mutator method for private field years
		years = t;
	}
	
	public void setMonths(double months) {//mutator method for private field months
		years = months/12;
	}
	
	public void setDays(double days) {//mutator method for private field days
		years = days/365;
	}
	
	public double getMaturityValue() {//accessor method for private field maturity value
		return maturityValue;
	}
	
	public void calculateSimpleInterest() {//mutator method to calculate simple interest for private field simple interest
		simpleInterest = (principal*rate*years);
	}
	
	public void calculateMaturityValue() {
		maturityValue = principal + simpleInterest;//mutator method to calculate maturity value for private field maturity value
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterest s1 = new SimpleInterest();
		Scanner input = new Scanner(System.in);
		double principal, rate, years, simpleInterest, maturityValue;//variables that will hold principal value, rate value, time value, simple interest value and maturity value - respectively
		int selection;//variable that will hold the value for the selection the user makes (to help identify if they are inputting years, months or days
		
		
		System.out.println("Hello, this is a Simple Interest Calulator");
		
		System.out.println("Enter the principal amount");
		principal = input.nextDouble();
		s1.setPrincipal(principal);
		
		System.out.println("Enter the interest rate per annum in %");
		rate = input.nextDouble()/100;
		s1.setRate(rate);
		
		System.out.println("Enter the value you would like to enter time in:\n1 = Years\n2 = Months\n3 = Days\n4 = multiple");
		selection = input.nextInt();
		if (selection == 1) {
			System.out.println("Enter number of years");
			years = input.nextDouble();
			s1.setYears(years);
		}else if (selection == 2) {
			System.out.println("Enter number of months");
			years = input.nextDouble();
			s1.setMonths(years);
		}else if (selection == 3) {
			System.out.println("Enter number of days");
			years = input.nextDouble();
			s1.setDays(years);
		}else if (selection == 4) {
			System.out.println("Enter number of years");
			double y = input.nextDouble();
			System.out.println("Enter number of months");
			double m = input.nextDouble()/12;
			System.out.println("Enter number of days");
			double d = input.nextDouble()/365;
			double t = y + m + d;
			s1.setYears(t);
		}
		
		s1.calculateSimpleInterest();
		s1.calculateMaturityValue();
		
		System.out.println("Simple interest = $" + s1.getSimpleInterest());
		System.out.println("Maturity value = $" + s1.getMaturityValue());
		
	}

}
