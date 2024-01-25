package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 55,
                weeklyHours = 46;
        double stateTaxRate= 7.5; // implicit casting
        double federalTaxRate = 24.5;
        //------------------------------
        double salaryBeforeTax= hourlyRate*weeklyHours*52; // 55*45*52
        double stateTax = salaryBeforeTax*stateTaxRate/100;
        double fereralTax = salaryBeforeTax*federalTaxRate/100;
        double netIncome = salaryBeforeTax - fereralTax - stateTax;
        double totalTax =  fereralTax + stateTax;
        System.out.println("Gross pay is: " +salaryBeforeTax+"\n"
        +"Federal Tax is: $"+fereralTax+"\n"
        +"Tax State is: $"+stateTax+"\n"
                +"Total Tax is: $"+totalTax+ "\n"
        +"Net income is: $"+netIncome);

    }


}
/*
1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560

 */