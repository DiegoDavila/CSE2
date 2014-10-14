//Diego Davila
//CSE2
//hw06-Root
//Purpose: take the square root of a number x
//Steps:
//Set low=0 and high=x+1 and midpoint=0 (for scope)
//Loop1:
    //Get the midpoint: (low+high)/2
    //if midpoint*midpoint>x, high=midpoint, else low=midpoint
    //Get midpoint until when high-low<0.0000001
    //Exit loop
//Print result

import java.util.Scanner;

//Class:
public class Root{
    
    //Main method:
    public static void main(String[] args){
        
        double x=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number greater than 0: ");
        x=scan.nextDouble();
        
        while (x<0){ //loop in case user inputs number less than 0, so program does not have to restart
            System.out.println("You did not enter a number greater than 0");
            System.out.print("Enter a number greater than 0: ");
            x=scan.nextDouble();
        }
        
        double low=0; //initial low number
        double high=(x+1); //initial high number
        double midpoint=0; //just initializing midpoint to be changed later
        
        while (high-low>0.0000001){ //while the difference between high and low is 0.0000001
            
            midpoint=((high+low)/2);
            
            if (midpoint*midpoint>x){ //if the midpoint squared is greater than x
                high=midpoint;
            }
            else { //if midpoint squared is less than x
                low=midpoint;
            }
            
        }//end of while the difference is greater than...
        
        double fn = (double) Math.round(midpoint*1000000)/1000000; //Rounding to be accurate to 6 decimal places 
        //This also avoids weird numbers like 1.9999999552965164 for the square root of 4
        
        System.out.println("You entered: " +x);
        System.out.println("The square root of " +x+ " is " + fn);
        
    }//end of main method
}//end of class