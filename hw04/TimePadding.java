//Diego Davila
//CSE2
//hw04-TimePadding
//Purpose: Give time of the day after receiving seconds elapsed
//Steps: 
//1. Ask user for number of seconds elapsed 
//2. Divide by 3600 to get the hour
//3. Convert to an int and subtract to get decimal 
//4. Multiply that decimal by 60 to get minutes
//5. Convert minutes to int and subtract to get decimal
//6. Multiply decimal by 60 to get number of seconds

import java.util.Scanner;
import java.text.DecimalFormat;

//Class:
public class TimePadding{
    
    //Main method
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in); //scanner class to accept input
        DecimalFormat f=new DecimalFormat("00"); //format to make sure we always have two digits (e.g 1:04:02)
        
        System.out.print("Enter the time in seconds: "); //ask user for input
        int secondsInput; //declaring user input
        int hour; //declaring hour
        int minutes; //declaring minutes
        int seconds; //declaring seconds
        
        if (input.hasNextInt()){ //If user entered an int
        secondsInput=input.nextInt();
        
            if (secondsInput>=0 & secondsInput<=86400){ //if seconds user place are inside the range of seconds in a day
        
                hour=(secondsInput/3600); //gets hour and makes it an int
                minutes=(secondsInput%3600)/60; //gets remainder of hour and divides by 60 to get time
                seconds=secondsInput%60; //remainder of total seconds over 60 is the number of seconds we want
        
                System.out.println("The time is " +(hour)+ ":" + f.format(minutes) +
                ":" + f.format(seconds));
                
            } //end of if
            
            else{
                System.out.println("You did not enter an int in the range [0,86400]");
                return;
            } //end of else 
        
        } //if 
        
        else{ //else (if the user did not input an int)
            System.out.println("You did not enter an int.");
            return;
        } //end of else
        
    }//end of main method
    
}//end of class