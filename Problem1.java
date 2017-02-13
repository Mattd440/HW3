/*
 # Name : Matt Diederick
 
 # Class: CSET 1200
 
 # Instructor: Dr. Jared Oluoch
 
 # Homework: 3
 
 # Date: 02-06-2017
 
 # Summary: This program allows the user to enter there significant others name then displays information about their name
 */


import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Enter your boyfriend/girlfriends first name, nick name and last name :");
        name = input.nextLine();

        System.out.printf("Your boyfriend or girlfriends name and nickname is: %s \n",name);
        System.out.printf("There name is %d characters long \n", name.length());
        System.out.printf("The first character in their name is: %s\n",name.charAt(0));
        System.out.printf("The last character in their name is: %s\n",name.charAt(name.length() -1));
        System.out.printf("The first word in their name is: %s\n",name.substring(0,name.indexOf(" ")));

    }
}
