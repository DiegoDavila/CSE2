//Diego Davila
//CSE2
//hw02-Bicycle

//Purpose: 
// 1. asks user for two numbers:
    //a. Cyclometer counts 
    //b. Time (seconds) on which the counts occured 
// 2. Prints out:
    //a. Total distance traveled (miles)
    //b. Time it took in minutes
    //c. Average speed (mph)
    
import java.util.Scanner; //imports Scanner to ask user for input

import java.text.DecimalFormat; //imports decimal format in order to round 

//Class
public class Bicycle{
    
     //Main method:
    public static void main(String[] args) {
        
        //Set values.
        double wheelDiameter=27.0, //Diameter of front wheel in inches
        PI=3.14159, //Numerical value of pi
        feetPerMile=5280, //Number of feet in one mile
        inchesPerFoot=12, //Number of inches in one foot
        secondsPerMinute=60; //Number of seconds in one minute
        
        Scanner input= new Scanner(System.in);//Declaring scanner variable name as "input"
        
        System.out.print("Enter number of cyclometer counts: "); //User enters number of counts in the cyclometer
            int counts=input.nextInt();
        
        System.out.print("Enter number of seconds: "); //User enters the seconds during which the cyclometer counted
            int seconds=input.nextInt();
        
        double timeMinutesTotal=seconds/secondsPerMinute; //total time in minutes with decimals 
        
        double distance=(PI*wheelDiameter*counts)/(inchesPerFoot)/feetPerMile; //total distance in miles
        int timeMinutes=(int) (seconds/secondsPerMinute); //integer of time in minutes 
        int timeSeconds=(int) ((timeMinutesTotal-(int) timeMinutesTotal)*60); //integer of the additional seconds 
        double timeHours=seconds/secondsPerMinute/60; //total time in hours
        double avgSpeed=distance/timeHours; //average speed in miles per hour
        
        DecimalFormat f = new DecimalFormat("###.00"); //rounding to two decimal places
    
    
        System.out.println("The total distance was " +f.format(distance)+ " miles and took " +timeMinutes+ " minutes and " +
        timeSeconds + " seconds.");
        System.out.println("The average speed was " +f.format(avgSpeed)+ " miles per hour.");
    
    }//end of main method
}//end of class
