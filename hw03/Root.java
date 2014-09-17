//Diego Davila
//CSE2
//hw02-Root

//Purpose:
//1. User enters a double
//2. Software computes cube root and gives estimate (guess)
//3. Software computes the cube of the guess (should be close to the user’s input)

import java.util.Scanner;

//Class:
public class Root{

	//Main method:
	public static void main(String[] args){

		Scanner input=new Scanner(System.in); //Scanner variable name “input”

		System.out.print("Enter a double: "); //user enters a double 
		double n=input.nextDouble();

		double guess=n/3;
		
		double guess2= (2*guess*guess*guess+n)/(3*guess*guess); //The more guesses the closer to the actual cube root
		double guess3= (2*guess2*guess2*guess2+n)/(3*guess2*guess2);
		double guess4= (2*guess3*guess3*guess3+n)/(3*guess3*guess3);
		double guess5= (2*guess4*guess4*guess4+n)/(3*guess4*guess4);
		double guess6= (2*guess5*guess5*guess5+n)/(3*guess5*guess5);
		double guessFinal= (2*guess6*guess6*guess6+n)/(3*guess6*guess6);
		
		//But, the larger the inputed double, the larger the error
		//This program will only work with relatively small numbers
		//Inputting very large numbers will lead to too large errors
		
		
		System.out.println("The cube root of " +n+ " is " +guessFinal);
		System.out.println("This yields " +guessFinal*guessFinal*guessFinal);
	
    }//end of main method
}//end of class
