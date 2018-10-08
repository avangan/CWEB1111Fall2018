//C.Fulton
import java.util.*;
import java.lang.Math;

public class Performer {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String firstName, lastName, eXIT;
        int shiftsWorked, transactionNum, userBonus;
        double dollarValue, prodScore;
        int thirtyBonus, eightyBonus, twoHundredBonus, overTwoHundredBonus;
        
        thirtyBonus = 25;
        eightyBonus = 50;
        twoHundredBonus = 100;
        overTwoHundredBonus = 200;
        eXIT = "STOP";
        System.out.println("This program will ask you input salesperson info and notify you if your a high achiever");
        System.out.println("To get started, please enter your first name");
        firstName = input.nextLine();
        while (!firstName.equalsIgnoreCase(eXIT)) {
            System.out.println("Please enter your last name");
            lastName = input.nextLine();
            System.out.println("Please enter the number of shifts");
            shiftsWorked = input.nextInt();
            System.out.println("Please enter the number of transactions completed this month");
            transactionNum = input.nextInt();
            System.out.println("Please enter the total amount of transactions for this month");
            dollarValue = input.nextDouble();
            prodScore = dollarValue / transactionNum / shiftsWorked;
            if (prodScore <= 30) {
                userBonus = thirtyBonus;
            } else {
                if (prodScore <= 80) {
                    userBonus = eightyBonus;
                } else {
                    if (prodScore < 200) {
                        userBonus = twoHundredBonus;
                    } else {
                        userBonus = overTwoHundredBonus;
                    }
                }
            }
            System.out.println(firstName + " " + lastName + " your productivity score will earn you a " + userBonus + " bonus.");
            System.out.println("IF you would like to enter another salesperson, please enter a new name or enter 'STOP' to exit program");
            firstName = input.next();
        }
        System.out.println("Thank you for using this program");
    }
}
