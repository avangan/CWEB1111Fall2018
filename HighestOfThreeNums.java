import java.util.*;

import java.lang.Math;

public class HighestOfThreeNums {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare the the variables I would need for end-user to enter three numbers  -- THE BIG QUESTION WHEN DECLARING VARIABLES IS TO ASK WHAT INFORMATION DO I NEED!!
        int numOne;
        int numTwo;
        int numThree;
        int sum;
        int limitTen;
        String keepGoing;
        int[] userNumbers = new int[3];

        System.out.println("Please enter 'start' to begin program or enter 'exit' to end program");
        keepGoing = input.nextLine(); //Primer
        while(keepGoing.equalsIgnoreCase("start")){
            limitTen = 10;
            System.out.println("Please enter your first number: ");
            numOne = input.nextInt();
            System.out.println("Please enter your second number: ");
            numTwo = input.nextInt();
            System.out.println("Please enter your third number: ");
            numThree = input.nextInt();
            sum = numOne + numTwo + numThree;
            userNumbers[0] = numOne;
            userNumbers[1] = numTwo;
            userNumbers[2] = numThree;
            
            // I need to assign each of the variables based on when the end-user inputs.
            if (sum > limitTen) {
                System.out.print("The numbers you entered are greater than " + limitTen);
            } else {
                System.out.println("The numbers you entered are less than " + limitTen);
            }

            //Ask the questions again
            System.out.println("If you would like to enter another round of numbers, please enter start or enter something other than start to exit program");
            keepGoing = input.next();

        }//closing bracket for while statement
        System.out.println("");
        System.out.println("Thank you for using this program");
    }
}
