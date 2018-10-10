import java.util.*;
import java.lang.Math;

public class  reviewchapt5 {
    private static Scanner inputValue = new Scanner(System.in);

    public static void main(String[] args) {
       String address;
       double price;
       int accumPrice = 0;
       String HEADING1 = "MONTH-END SALES REPORT";
       String HEADING2 = "Address             Price";
       String QUIT = "QUIT"; //Sentinel value

       System.out.println(HEADING1);
       System.out.println(HEADING2);

       System.out.println("Enter address of property");
       address = inputValue.nextLine();

       //Looping structure
       while(address.equalsIgnoreCase(QUIT)){
           System.out.println("Enter price of property");
           price = inputValue.nextLine();

           System.out.println(address + " "+ price);
           accumPrice = accumPrice + price;

           System.out.println("Please enter another address or enter 'QUIT' to exit program");
           address = inputValue.next();

       }

       //Sequence
       System.out.println("Total accumulative of all entries is " + accumPrice);

    }
    

    
}