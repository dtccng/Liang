import java.util.Scanner;

public class Exercise06_07 {
	  
    public static double futureInvestmentValue(double amount, double monthlyInterestRate, int year){

	return Math.round(amount * Math.pow((1 + monthlyInterestRate), (year * 12)) * 100) / 100.0;
		
    }

    public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		double amount = 0.0;
		double annualInterestRate = 0.0;
		final int YEARS = 30;

		System.out.println("Enter Amount Invested: ");
		amount = scnr.nextDouble();
		
		System.out.println("Ener Annual Interest Rate: ");
		annualInterestRate = scnr.nextDouble();
		
		System.out.printf("Years\tFuture Value\n");
		
		for(int i = 1; i <= YEARS; i++){
			System.out.printf("%3d\t$%,11.2f%n", i, futureInvestmentValue(amount, (annualInterestRate / 1200), i));
		}
		
		scnr.close();
		
		return;
    } 

}
