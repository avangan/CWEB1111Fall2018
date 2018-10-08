//C.fulton
import java.util.*;
import java.lang.Math;

public class chapt5_1af {
   // private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       //a
       int a = 1;  int g = 4; int p = 2;
       int b = 2;  int h = 6; int q = 4;
       int c = 5;  int j = 2; int r;
       int d = 4;  int k = 5;
       int e = 6;  int n = 9;
       int f = 7;  int m = 6;
       
       //This is a
       while( a < c){

            a = a +1;
            b = b + c;

       }
       System.out.println("This is 'A' : For a you get " + a + " For b you get " +  b + " For c you get " +  c);
       //2, 7, 5 - Andrew

       //This is b
       while(d >f){
           d = d +1;
           e = e - 1;
       }
       System.out.println("This is 'B' : For d you get " + d + " For e you get " +  e + " For f you get " +  f);

       //This is c
    //    while(g < h){
    //        g = g + 1;

    //    }
    //    System.out.println("This is 'C' : For g you get " + g + " For h you get " + h);
       

       //Comment to notate the output for d

    //   System.out.println("Listed below is the output for letter D");

       //This is d
    //    while(j < k){
    //        m = 6;
    //        while(m < n){
    //            System.out.println("Goodbye");
    //            m = m + 1;
    //        }
    //        j = j + 1;
    //    }

       //This is e
        //Comment to notate the output for e

        System.out.println("Listed below is the output for letter E");

       while(j < k){
           while(m < n){
               System.out.println("Hello");
               m = m +1;
           }
           j = j + 1;
       }

    //This is f
    System.out.println("Listed below is the output for letter F");

    while(p < q){
        System.out.println("Adios");
        r = 1;
        while(r < q){
            System.out.println("Adios");
            r = r + 1;
        }
        p = p + 1;
    }

    }
}