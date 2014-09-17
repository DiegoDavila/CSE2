//Diego Davila
//CSE2
//hw03-FourDigits 

//Purpose:
//User inputs a double and program gives the first four decimal digits. 

//Steps:
//1. Get double n from user 
//2. Cast the double n to an int (nInt). 
//3. Multiply double n by 10000 (nThousand)
//4. Multiply double nInt by 10000 (nIntThousand)
//5. Subtract nThousand – nIntThousand (Subtraction)
//6. Cast Subtraction to an int. 
//7. Print results. 

import java.util.Scanner; //import scanner to ask user for input
import java.text.DecimalFormat; //Format so that there are always for digits (ex. 0023)

//Class:
public class FourDigits{
    
    //Main method:
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in); //Declaring scanner variable name "input"
    
    System.out.print("Enter a double and I display four digits to the right of the decimal point: ");
        double n=input.nextDouble();
        
    int nInt=(int)n; //Cast double n to an int 
    
    double nThousand=(n*10000); //Multiply double n by 10000 
    int nIntThousand=(nInt*10000); //Casting double multiplied by 10000
    int Subtraction=(int)((nThousand-nIntThousand));
    
    DecimalFormat f= new DecimalFormat("0000");
    
    
    System.out.println("The four digits are: " + f.format(Subtraction));
    
        
    
       
        
    } //End of main method
} //end of class