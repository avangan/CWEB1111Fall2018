import java.util.*;
import java.lang.Math;

public class  reviewchapt5 {
    private static Scanner inputValue = new Scanner(System.in);

    public static void main(String[] args) {
       /**Building functionality that allows an end-user to enter the appropriate age
        * to enter bar.  They must enter an age between 21 and 55.  They wil have three 
            attemps to enter the correct age
        */
        //Declare variables
        int age, attemptCount;
        final int MAX_AGE = 55, MIN_AGE = 21, ATTEMPTS = 2;

        System.out.println("This program will check whether or not you can enter the bar"); //OUTPUT
        System.out.println("Please enter your age"); //OUTPUT
        age = inputValue.nextInt();  //INPUT

        /**LOOPING STRUCTURE - check to see if the user in-between min and max age, also going to check for
        number of attempts**/
        //verfiy age is within correct range
        attemptCount = 0;
        while((age < MIN_AGE || age > MAX_AGE ) && (attemptCount < ATTEMPTS)){
            System.out.println("Sorry, you do not meet the minimum age to enter bar, sorry.  Please enter an appropriate age");
            age = inputValue.nextInt();
            attemptCount +=1; //attemptCount = attemptCount + 1;

        }
        if(attemptCount == ATTEMPTS){
            System.out.println("Sorry, you have attempted the wrong age to many times");
        }else{
            System.out.println("Welcome to the bar");
        }

        System.out.println("Program has concluded");
    }
    

    
}