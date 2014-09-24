//Diego Davila
//CSE2
//hw04-Month
//Purpose: give number of days in a month
//Steps:
//1. Ask user for an int representing the month.
//2. Check if number is an int
//3. Check if number is between 1 and 12
//4. Give number of days in month

import java.util.Scanner;

//Class: 
public class Month{
    
    //Method
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter an int giving the number of the month (1-12): ");
        int month;
        
        if (input.hasNextInt()){ //If user entered an int
            month=input.nextInt();
            
        switch (month) {
            
            case 1: //user input is 1
                System.out.println("January has 31 days.");
                break;
            case 2: //user input is 2
                System.out.print("Enter an int giving the year: ");
                int year; //declaring year as an int
                
                if (input.hasNextInt()) { //if year input is an integer
                    year=input.nextInt(); //defining year as user input
                    
                    //In Gregorian calendar, years divisible by 100 are leap years only
                    //if they are also divisible by 400
                    
                    if ((year%4==0 & !(year%100==0)) || (year%100==0 & year%400==0)){ 
                            System.out.println("February of " +year+ " has 29 days.");
                    }
                    else {
                        System.out.println("February of " +year+ " has 28 days.");
                    }
                }
                else {
                    System.out.println("Invalid year.");
                }
                break;
            case 3: //user input is 3
                System.out.println("March has 31 days.");
                break;
            case 4: //user input is 4
                System.out.println("April has 30 days.");
                break;
            case 5: //user input is 5
                System.out.println("May has 31 days.");
                break;
            case 6: //user input is 6
                System.out.println("June has 30 days.");
                break;
            case 7: //user input is 7
                System.out.println("July has 31 days.");
                break;
            case 8: //user input is 8
                System.out.println("August has 31 days.");
                break;
            case 9: //user input is 9
                System.out.println("September has 30 days.");
                break;
            case 10: //user input is 10
                System.out.println("October has 31 days.");
                break;
            case 11: //user input is 11
                System.out.println("November has 30 days.");
                break;    
            case 12: //user input is 12
                System.out.println("December has 31 days.");
                break;    
            default: 
                System.out.println("Invalid month. You did not enter an int between 1 and 12");
                
            
        }//end of switch statment 
        
        }// end of if statement
        
        else { //else (if user did not enter an int)
            System.out.println("You did not enter an int.");
            return;
        } //end of else statement
        
    }//end of main method
    
}//end of class