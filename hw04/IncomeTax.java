//Diego Davila
//CSE1
//hw04-IncomeTax.java
//Purpose: Calculate income tax according to income.
//Steps:
//1. Ask for int giving number of thousand dollars income
//2. Check if number is an int 
//3. Check if number is grater than or equal to 0
//4. Check income case:
//Case 1: income<0, print "input is less than zero"
//Case 2: 0<=income<20, 5% tax
//Case 3: 20<=income<40, 7% tax
//Case 4: 40<=income<78, 12% tax
//Case 5: income>=78, 14% tax

import java.util.Scanner; //import scanner
import java.text.DecimalFormat; //import decimal format

//Class: 
public class IncomeTax{
    
    //Main method
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        DecimalFormat f=new DecimalFormat("#########.00");
        
        System.out.print("Enter an int giving number of thousand dollars of income: ");
        int answer; //Declares int named "answer"
        int income; //Declares in named "income"
        
        if (input.hasNextInt()){ //start of if1 "if user input is an integer"
            
            answer=input.nextInt(); //defines answer as user input
            income=(answer*1000); //defines income as user input times 1000
            
            System.out.println("You entered: " +answer);
            
                if (answer<0) { //if user entered in less than 0
                    System.out.println("You did not enter an int greater than or equal to zero.");
                    return; //end program
                }
                else if (answer>=0 && answer<20) { //if 
                    System.out.println("The tax rate on $" +income+ " is 5.0% and the income tax is $" +
                    f.format(income*0.05)); //prints income tax
                }
                else if (answer>=20 && answer<40) {
                    System.out.println("The tax rate on $" +income+ " is 7.0% and the income tax is $" +
                    f.format(income*0.07));
                }
                else if (answer>=40 && answer<78) {
                    System.out.println("The tax rate on $" +income+ " is 12.0% and the income tax is $" +
                    f.format(income*0.12));
                }
                else {
                    System.out.println("The tax rate on $" +income+ " is 14.0% and the income tax is $" +
                    f.format(income*0.14));
                }
                
        }//end of if1
               
        
        else { //start of else1 "If user did not enter an int
            System.out.println("You did not enter an int.");
            return; //ends program
        } //end of else1
        
        
    }//end of method
}//end of class