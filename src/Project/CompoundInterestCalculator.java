package Project;
import java.util.Scanner;

public class CompoundInterestCalculator {
	
	public static void main(String[] args) {
		
		// COMPOUND INTEREST CALCULATOR
		
		// A = P [1 + r/n]^(nt)
		// A - final amount
		// P - initial principal balance
		// r - interest rate
		// n - number of times interest applied per time period
		// t - number of time periods elapsed
		
		Scanner s = new Scanner(System.in);
		
		double principal;
		double rate;
		int timesCompounded;
		int years;
		double amount;
		
		System.out.print("Enter the Principal Amount: ");
		principal = s.nextDouble();
		
		System.out.print("Enter the interest rat (in %): ");
		rate = s.nextDouble() / 100;
		
		System.out.print("Enter the # of times compounded per year: ");
		timesCompounded = s.nextInt();
		
		System.out.print("Enter the # of years: ");
		years = s.nextInt();
		
		amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
		
		//System.out.println("The amount after " + years + " is: $" + amount);
		System.out.printf("The amount after %d years is $%.2f", years, amount);
		
		s.close();
	}

}
