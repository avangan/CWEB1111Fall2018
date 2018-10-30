import java.util.*;
import java.lang.Math;

public class Chapt6_ec {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
       
       //DECLARATIONS

       int userEntry, x;
       int [] userNumbers = new int[12];

       System.out.println("This program will ask you to enter 12 numbers and will output your numbers in reverse order");

       for(x = 0; x < userNumbers.length; x++){
           System.out.println("Please enter a number for slot " + (x+1));
           userEntry = input.nextInt();
           userNumbers[x] = userEntry;

       }

       System.out.println("Number in reverse order are listed below");
       for(x = userNumbers.length; x > 0; x--){
           
           System.out.println("For slot : " + x + " you input " + userNumbers[x-1]);
       }

       System.out.println("Program has concluded");


        
    }


    
}