/*
 # Name : Matt Diederick
 
 # Class: CSET 1200
 
 # Instructor: Dr. Jared Oluoch
 
 # Homework: 3
 
 # Date: 02-06-2017
 
 # Summary: This program allows the user to enter a course name and verifys its size and prints out the information about the course
 */


import java.util.Scanner;
public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String course= null;
        String degreeCode = null;
        String sectionCode= null;

        System.out.println("enter the 8 digit alpha-numeric code for a CSET course offered at the University of Toledo");
        course = input.nextLine();
        if (course.length() == 8) {
            degreeCode = course.substring(0,4);
            sectionCode = course.substring(4,course.length());
            System.out.printf("The program is: \t %s\n", degreeCode);
            System.out.printf("The course Number is: \t %s\n", sectionCode);
            System.out.printf("The complete course number is: \t %s\n", course);
        }
        else{
            System.out.println("Course code must contain 8 figures");
        }

    }
}
