package Test;

import java.util.Scanner;
public class Exercise06_07 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Investment Amount");

        int investmentAmount =input.nextInt();

        System.out.println("Enter the Anual Interest rate");

        double InterestRate = input.nextDouble();

        double monthlyInterestRate = InterestRate/1200;

        System.out.println("The amount invest: $" + investmentAmount);

        System.out.println("Annual interest rate:" + InterestRate +"%");

        System.out.println("Years" +"\t" + "Future Value");

        int years=0;

        //DecimalFormat df = new DecimalFormat("###.##");

        while(years<30)

        {



            years++;



            System.out.println(years + "\t" +(futureInvestmentValue(investmentAmount,monthlyInterestRate,years)));

        }

    }//end of main

    public static double futureInvestmentValue (double investmentAmount, double monthlyInterestRate, int years)

    {

        double futureInvestmentValue =0.0;



        futureInvestmentValue =investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);



        return futureInvestmentValue;

    }

}
