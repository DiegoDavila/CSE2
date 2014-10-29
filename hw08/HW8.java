//Diego Davila
//CSE2
//

import java.util.Scanner;
public class HW8{
    
  public static void main(String []arg){
    
    char input; //character input
    
    Scanner scan=new Scanner(System.in);
    
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    input=getInput(scan,"Cc"); //first method, getInput(Scanner, String)
    
    System.out.println("You entered '"+input+"'");
    
    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    input=getInput(scan,"yYnN",5); //give up after 5 attempts second method, getInput(Scanner, String, int)
    
    if(input!=' '){ //if input is ' ' meaning after 5 attempts
       System.out.println("You entered '"+input+"'");
    }
    
    input=getInput(scan,"Choose a digit.","0123456789");
    System.out.println("You entered '"+input+"'");
    
  }//end of main method  
  
    public static char getInput (Scanner x, String string){
        String s=x.nextLine();
        char c='z';
        boolean inString=false;
        
        //following while loop is used to restart the whole thing so that the program 
        //gives the correct error message for its corresponding error instead of just giving
        //the next error message contained in the following iteration

       	while (s.length()!=1 || inString==false){ 
        	while (s.length()!=1){ //if the string is not of length 1
        		System.out.print("You should enter exactly one character, try again: ");
            	s=x.nextLine();
        	}
        
        	c=s.charAt(0); //if the user entered a char of length 1 convert to a char
        
        	for (int i=0; i<string.length(); i++){
        		if (string.charAt(i)==c){
        			inString=true;
        			break;
        		}
        		else{
        			inString=false;
        			continue;
        		}
        	}
        	
        	while (inString==false){
        		System.out.print("You did not enter a character from the list " +string+ " ; try again: ");
        		s=x.nextLine();
        		break;
        	}
        }
    
        return c;
        
  }//end of first method getInput(Scanner, string)
  
    public static char getInput (Scanner x, String string, int limit){
        String s=x.nextLine();
        char c='z';
        boolean inString=false;
        
        for (int k=1; k<limit; k++){ //for loop to stop trying after the given limit
            
            //following while loop is used to restart the whole thing so that the program 
            //gives the correct error message for its corresponding error instead of just giving
            //the next error message contained in the following iteration
            
       		while (s.length()!=1 || inString==false){ 

        		if (s.length()!=1){ //if the string is not of length 1
        			System.out.print("You should enter exactly one character, try again: ");
            		s=x.nextLine();
            		break;
        		}
        
        		c=s.charAt(0); //if the user entered a char of length 1 convert to a char
        	
        		for (int i=0; i<string.length(); i++){ //for loop to check if the char entered by user is in the given string
        			if (string.charAt(i)==c){
        				inString=true;
        				break;
        			}
        			else{
        				inString=false;
        				continue;
        			}
        		}
        	
        		if (inString==false){ //if statement for prompting that char entered is not an acceptable value
        			System.out.print("You did not enter a character from the list " +string+ " ; try again: ");
        			s=x.nextLine();
        			break;
        		}//end of if statement for prompting that char entered is not an acceptable value

        	}//end of while loop with two conditions
        
        }//end of for loop
        
        if (s.length()!=1 || inString==false){ //if after the for loop is done the user still has not entered the required chars
        	c=' ';
        }
    
        return c; //return the char
        
  }//end of second method getInput (Scanner, String, int)
  
    public static char getInput (Scanner x, String prompt, String condition){
        System.out.print("" + prompt + " ");
        String s=x.nextLine();
        char c='z';
        boolean inString=false;
        
       	while (s.length()!=1 || inString==false){ 

        		while (s.length()!=1){ //if the string is not of length 1
        			System.out.print("You should enter exactly one character, try again: ");
            		s=x.nextLine();
        		}
        
        		c=s.charAt(0); //if the user entered a char of length 1 convert to a char
        	
        		for (int i=0; i<condition.length(); i++){ //for loop to check if the char entered by user is in the given string
        			if (condition.charAt(i)==c){
        				inString=true;
        				break;
        			}
        			else{
        				inString=false;
        				continue;
        			}
        		}
        	
        		while (inString==false){ //if statement for prompting that char entered is not an acceptable value
        			System.out.print("You did not enter a character from the list " +condition+ " ; try again: ");
        			s=x.nextLine();
        			break;
        		}//end of if statement for prompting that char entered is not an acceptable value
        	
        	}//end of while loop with two conditions
    
        return c;
        
    }//end of third method
  
  
  
}//end of class

