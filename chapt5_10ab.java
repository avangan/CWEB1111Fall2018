import java.util.*;
import java.lang.Math;

public class chapt5_10ab {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       
        //Declare variables
        int acctNum, MONTH_LIMIT = 12, month;
        double purchasePrice, paymentAmt, balance, INTEREST_CHARGE = .0125, BALANCE_LIMIT = 25.00, PAY_RATE = .07;
        String name;

        System.out.println("This program will calculate the balance due for each of the 12 month payments with an interest charge of 1.25 percent.  The program will pay off 7 percent with each payment.");
        System.out.println("Please enter your account number: ");
        acctNum = input.nextInt();
        input.nextLine();

        System.out.println("Please enter your name: ");
        name = input.nextLine();

        System.out.println("Please enter your purchase price: ");
        purchasePrice = input.nextDouble();

        month = 0;
        //Looping Structure
        while(month < MONTH_LIMIT){

            //add the monthly interest
            purchasePrice = purchasePrice * (1 + INTEREST_CHARGE);

            if(purchasePrice <= BALANCE_LIMIT){

                System.out.println("One final payment is " + purchasePrice);
                purchasePrice = 0;
                System.out.println("No remaining balance after this payment");
                month = MONTH_LIMIT;
            }else{
                //take the purchase price and apply the pay rate
                paymentAmt = purchasePrice * PAY_RATE;
                //Get the remaining balance
                //Deduct the monthly payment from balance
                purchasePrice = purchasePrice - paymentAmt;
                
                //output information for monthly payments
                System.out.println("For month " + (month +1) + " your payment is " + paymentAmt + " and your remaining balance is " + purchasePrice);
                month++; //month = month + 1
    
            }
        }

        System.out.println("Program has concluded");



    }
}