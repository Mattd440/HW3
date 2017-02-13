
/*	Problem 4
	Solve programming excercise 4.25 in page 156 of the textbook BUT
	MODIFY IT so that a vehicle's number plate consits of 1 uppercase
	letter, 2 lowercase letters, followed by 6 digits.
*	(5 Points)


*/
import java.util.*;
public class Problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String licensePlate="";
        String temp;

        System.out.println("Enter a three characters then six digits to form a license plate ");
        temp =  input.nextLine();
        if(temp.length() != 9){
            System.out.println("License Plate must contain 9 characters");
        }
        if(Character.isLetter((char)temp.charAt(0)) &&
           Character.isLetter((char)temp.charAt(1)) &&
           Character.isLetter((char)temp.charAt(2))){
           licensePlate += Character.toUpperCase((char)temp.charAt(0));
           licensePlate += Character.toLowerCase((char)temp.charAt(1));
           licensePlate += Character.toLowerCase((char)temp.charAt(2));

        }
        else{
            System.out.println("First three characters must be letters");
        }
         if(Character.isDigit((char)temp.charAt(3)) &&
            Character.isDigit((char)temp.charAt(4)) &&
            Character.isDigit((char)temp.charAt(5)) &&
            Character.isDigit((char)temp.charAt(6)) &&
            Character.isDigit((char)temp.charAt(7)) &&
            Character.isDigit((char)temp.charAt(8))){

            licensePlate += temp.charAt(3);
             licensePlate += temp.charAt(4);
             licensePlate += temp.charAt(5);
             licensePlate += temp.charAt(6);
             licensePlate += temp.charAt(7);
             licensePlate += temp.charAt(8);

             System.out.println( "License Plate #:" + licensePlate);
         }
         else{
             System.out.println("Characters 4 - 9 must be digits");
         }


    }
}
