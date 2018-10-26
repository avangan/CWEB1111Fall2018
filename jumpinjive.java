import java.util.*;
import java.lang.Math;

public class jumpinjive {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        //Declarations
        String [] PRODUCT = new String[]{"Whipped Cream", "Cinnamon", "Chocolate Sauce","Amaretto","Irish Whiskey"};
        double [] PRICE = new double[]{.89, .25, .59,1.50,1.75};
        final double CUP = 2.00;

        double total = CUP;
        String isFound;
        String QUIT = "EXIT";
        String entry;
        int  x;

        //Housekeeping welcome the end-user and get the initial priming value
        System.out.println("Welcome this program will provide you with a total price based on the add ons you enter.  The base price for a cup of coffee is 2.00.");
        System.out.println("Let's get started, please enter your first add on.  Please enter  for Whipped Cream,  for Cinnamon,  for Chocolate Sauce,  Amaretto, and  for Irish Whiskey");
        entry = input.nextLine(); //Primer

        //Looping
        while(!entry.equals(QUIT)){
            //Take input and assign to total, we need looping to determine if the product is in the array
            isFound = "false";
             x = 0; //incrementing variable
            while(x < PRODUCT.length){
                //Need a decision structure to determine if entry is a valid product
                
                if(entry.equals(PRODUCT[x])){
                    isFound = "true";
                    total = total + PRICE[x];
                    x = PRODUCT.length;
    
                }else{
                    x = x+1;
                }
            }
            if(isFound.equals("false")){
                System.out.println("Sorry we do not carry that");
            }else{
            System.out.println("You have entered " + entry + " your current price is " + total);
            }

            System.out.println("Please enter another add-on or enter 'EXIT' to exit program");
            entry = input.nextLine(); //Primer
        }

        
    }


    
}