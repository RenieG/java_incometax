import java.util.Scanner;


public class TaxProgram {
    public static void main (String [] args){

        /*
        Small Tax Program Instructions

        1.You need to store the users income, tax and NewIncome
        2. Ask user for their taxable income
        3. Accept user income
        4. Store the user's input
        5. Calculate tax only
        6. Calculate income after tax (NewIncome)
        7. Print the new income
         */

        double income, tax, newIncome;

        System.out.println("Please enter your taxable income:");
        Scanner userinput=new Scanner(System.in);

        income = userinput.nextDouble();
        tax = income * 0.13;
        newIncome = income - tax;

        System.out.println("income(before tax);" + income);
        System.out.println("income(after tax);" + newIncome);
    }

}
