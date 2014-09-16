//Diego Davila
//CSE2
//lab03-BigMac

//Purpose: Computes cost of buying BigMacs 
//Steps:
    //Asks user for number of BigMacs
    //Asks user for cost per BigMac
    //Asks user for tax percentage
    
import java.util.Scanner;

//Class:
public class BigMac{
    
    //Main method:
    public static void main(String[] args) {
        
        Scanner myScanner; //Declaring scanner just as variables
        
        myScanner= new Scanner(System.in); //Creating a scanner instant that will take input 
        
        System.out.print("Enter the number of Big Macs (an integer > 0): "); //System.out.print instrad of .prinln cursor will not go to next line
            int nBigMacs=myScanner.nextInt(); //Accepting input
        
        System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx): " );
            double bigMac$=myScanner.nextDouble();
        
        System.out.print("Enter the percent tax as a whole number (xx): ");
            double taxRate=myScanner.nextDouble();
            taxRate/=100;
            
        double cost$; //Total cost of BigMac
        int dollars, dimes, pennies;
        
        cost$=nBigMacs*bigMac$*(1+taxRate);
        
        //%  divides and returns remainder
        
        dollars=(int)cost$; //dollar part of cost
        dimes=(int)((cost$*10)%10); //dimes (tenth place) of cost
        pennies=(int)(cost$*100)%10;
        
        System.out.println("The total cost of " +nBigMacs+ " Big Macs, at $" +bigMac$+ " per Big Mac, with a " + " sales tax of " + 
        (int)(taxRate*100) + "%, is $" + dollars + "." +dimes+pennies);
        
     
     
     
        
    } //end of main method
} //end of class