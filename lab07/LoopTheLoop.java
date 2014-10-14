//Diego Davila
//CSE2
//lab07-LoopTheLoop


import java.util.Scanner;

//Class
public class LoopTheLoop{
    
    //Main method:
    public static void main(String[] args){
        
         Scanner scan = new Scanner(System.in);
        
        int nStars = -1;
        
        while (nStars<1 || nStars>15) {
        
        	System.out.print("Enter an int between 1 and 15: ");
        	
        	
        	if (scan.hasNextInt()) {
        		nStars=scan.nextInt();
        		
        		if (nStars>=1 && nStars<=15){
        		break;
        		}
        		else{
        		System.out.println("You did not enter an int between 1 and 15");
        		continue;
        		}
        	}
        	
        	else {
        		while (!scan.hasNextInt()) {
        			System.out.println("You did not enter an int");
        			System.out.print("Enter an int between 1 and 15: ");
    				nStars = scan.nextInt();
    				
        			if (scan.hasNextInt()){
        				break;
        			}	
        		}	
        	}
        }
        

        int input=(nStars+1);
        int n1=input;
        
        while (nStars>0) {
            
            while (nStars < n1) { //Start of while nStars is less than 20
                System.out.print("*");
                n1--;  //adds one to nStars
            } //end of while nStars is less than 20
            
            nStars--;
            n1=input;
            System.out.println();
        }
        
    
    } //end of main method
} //end of class