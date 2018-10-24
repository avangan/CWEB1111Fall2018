import java.util.*;
import java.lang.Math;

public class student {
    private static Scanner input = new Scanner(System.in);
    /**There are 4 students Marine, Liam, Andrew and Nick each student has 5 classes.  
     * One class are called Math, English, Science, 
     * Web Development and Database.  Output each student along with their 5 classes. **/
    public static void main(String[] args) {
       
        //Declarations
        String [] students = new String[]{"Marine", "Liam", "Andrew", "Nick"};
        String [] classes = new String[]{"Math","English","Science","Web Development","Database"};
        int y, x;
        //Outer Loop
        y = 0;
        //Looping
        while(y < students.length){
            //Sequence
           System.out.println("For " + students[y] + " the schedule is listed below:");
           x =0;
           //So now output the courses for a particular student. We need a looping structure
           while(x < classes.length){
               //sequence
               System.out.println(classes[x]);
               x++;
           }
           System.out.println("");
           y++;
        }
        System.out.println("Program has concluded");

    }

        
        /**Populating the array
         *  String [] student = new String[4];
        String studentsName;
        while(x < student.length){
            System.out.println("Please enter a student's name");
            studentsName = input.nextLine();

            //input the student name into the array
            student[x] = studentsName;
            x++;
        }

        //Looping structure enhanced for loop
        for(String y : student){

            System.out.println("Output of Students");
            System.out.println(y);
        }**/


    
}