import java.util.*;
import java.lang.Math;

public class dependents {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       
        //Declare variables
        int dep;
        int counts[] = new int [6];
        counts[0] = 0; 
        counts[1] = 0;
        counts[2] = 0; 
        counts[3] = 0;
        counts[4] = 0; 
        counts[5] = 0;

        int QUIT = 999;
        System.out.println("Let's get stated, please enter the number of dependents you have");
        dep = input.nextInt();
        while(dep != QUIT){
            counts[dep] = counts[dep] + 1;

            System.out.println("Enter dependent or 999 to exit");
            dep = input.nextInt();
        }

        System.out.println("Dependents Count");
       int x = 0;
        while(x < 6){
            System.out.println("For " + x + " dependents we have a count of " + counts[x]);
            x++;
        }
    
        System.out.println("Program has concluded");  
        }

        



    
}