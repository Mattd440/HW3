/*
        Name : Matt Diederick

        # Class: CSET 1200

        # Instructor: Dr. Jared Oluoch

        # Homework: 3

        # Date: 02/07/2016

        # Summary:This program allows the user to enter a data then validates that it
        is in the proper format
*/

import java.util.*;

public class Problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String date;
        int day,month,year;
        String dateArray[];
        System.out.println("Enter a data in the format DD-MM-YYYY");
        date = input.nextLine();

        // ensure characters in positions 2 and 5 are dashes
        if(date.charAt(2) == '-' && date.charAt(5) == '-'){
            try{
                // split into three groups  at the dash position
                dateArray = date.split("-");
                // day is the first position
                day =Integer.parseInt(dateArray[0]);
                // month is the second position
                month =Integer.parseInt(dateArray[1]);
                // year is second position
                year =Integer.parseInt(dateArray[2]);

                // ensure each value is within logical range for a day month or year
                if(day > 0 && day <=31){
                    if(month > 0 && month <=12){
                        if (year > 1800 & year <=2200){
                            System.out.println("Valid Year");
                        }
                    }
                }
            } catch(NumberFormatException e){
                System.out.println("Enter numbers only");
            }

        }
        else{
            System.out.println("Invalid Format Must Contain '-' ");
        }
    }
}
