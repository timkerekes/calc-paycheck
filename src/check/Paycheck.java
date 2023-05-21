package check;
import java.util.Scanner;

public class Paycheck {
	
	 static final double FED_TAX = 0.15;
	 static final double STATE_TAX = 0.05;
	 //static final double PAY_RATE = 16.00;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		int hours;
		int payRate;
		double gross;
		double deductions;
		double net;
		double paycheck;
		
		System.out.println("Please enter the amount of hours worked this pay cycle: ");
		
		hours = reader.nextInt();
		
		System.out.println("Please enter your hourly wage: $");
		
		payRate = reader.nextInt();
		
		gross = hours * payRate;
		
		//double gross = hours * PAY_RATE;
		
		deductions = (gross * FED_TAX) + (gross * STATE_TAX);
		
		net = gross - deductions ;
				
		paycheck = net;
		
		System.out.println("Your paycheck will be: $" + paycheck);
		
		reader.close();
		
	}

}
