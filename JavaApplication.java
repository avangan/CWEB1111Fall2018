import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Determine what data is needed to run your program and declare and initialize necessary variables.
        int highNum;
        
        highNum = 0;
        int y;
        
        y = 1;
        int x;
        int n;
        
        n = 0;
        int count;
        
        count = 0;
        int[] randomNum = new int[3];
        
        // Always start your program. With an introduction that will describe exactly what your program will do and how the program will interact with the end-user.
        // 
        // Thinking through your introduction will help you understand the problem you are trying to solve and will help you plan the logic.
        System.out.println("Welcome to this program, this program will evaluate 3 interger numbers and tell you which one is the highest");
        
        // Populating the array - iterate 3 times to get three numbers from the end-user
        while (count < 3) {
            System.out.println("Please enter number for slot number" + (count + 1));
            n = input.nextInt();
            randomNum[count] = n;
            count = count + 1;
        }
        
        // Once array is populated with three numbers from the end-user, the logic below determines the highest value by iterating through the array using a for loop.
        for (x = 0; x <= 2; x++) {
            if (randomNum[x] >= highNum) {
                highNum = randomNum[x];
            }
        }
        
        // Once number is determined, you output summary text and the value of the highest number.
        System.out.println("Thank you for entering your numbers.  The highest number you entered is " + highNum);
        System.out.println("Have a nice day");
    }
}
