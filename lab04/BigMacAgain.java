//Diego Davila
//CSE2
//lab04-BigMacAgain
//Purpose:
//1. Ask user for number of Big Macs
//2. Give the number of Big Macs plus cost for all
//3. Ask if the user wants fries or not
//4. Compute cost of adding fries IF user ordered it.
//5. Give total cost of meal

import java.util.Scanner; //Import Scanner
import java.text.DecimalFormat; //Import Decimal Format

//Class:
public class BigMacAgain{
    
    //Main method:
    public static void main(String[] args) {
        
        DecimalFormat f=new DecimalFormat("####.00"); //Defines the format of decimals
        
        Scanner input;  
        
        input = new Scanner(System.in); //defines scanner name
        
        System.out.print("Enter the number of Big Macs: "); //Asks user for number of Big Macs
    	int nBigMacs; //Number of Big Macs
	    double priceBigMacs; //Total price of Big Macs
            
        if (input.hasNextInt()){   //Start of if1 "if input is an int"
           
            nBigMacs=input.nextInt(); //Number of Big Macs  
             priceBigMacs=(nBigMacs*2.22);
                if (nBigMacs>=0){ //Start of if2 "if input is greater than 0"
                
                    System.out.println("You ordered " +nBigMacs+ " Big Macs at $2.22 each for a cost of " +f.format(priceBigMacs));
               
                }//end of if2
                
            	else {
                    System.out.println("You did not enter an int>0"); //Tells user he did not use int
                    return; //Terminates the program
                }//end of else1
                
            } //end of if1
            else {
                System.out.println("You did not enter an int"); //Tells user he did not use int
                return; //Terminates the program
            }//end of else2
                        
                        
        System.out.print("Do you want an order of fries? (Y/y/N/n)? "); //Do you want fries with that?
        String answer=input.next(); //Defines answer as the user's input
        System.out.println("You said " +answer); //Print the answer given by user
           
            
            if (answer.equals("Y") || answer.equals("y") ||
            answer.equals("N") || answer.equals("n")) {         //Start of if3 "if user did NOT (! before ans...) enter Y/y/n/N"
                
                if (answer.equals("Y") || answer.equals("y")) {       //Start of if4 "If user said yes (Y/y)"
                    System.out.println("You ordered fries at a cost of $2.15");
                    System.out.println("The cost of your meal is " + f.format(priceBigMacs+2.15));
                
                } //end of if4
            
            	else {      //Start of else3
                    System.out.println("The total cost of the meal is " +f.format(priceBigMacs));
                } //end of else3
            
            } //end of if3
             
			else {      //Start of else4
                System.out.println("You did not enter one of 'Y', 'y' , 'N' , or 'n'"); 
                return; //Ends programs
            } //end of else4
                
                
             
        
        
    } //End of method
} //End of class