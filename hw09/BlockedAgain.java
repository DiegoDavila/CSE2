//Diego Davila
//CSE2
//hw09-BlockedAgain

import java.util.Scanner;
public class BlockedAgain{
    
    public static void main(String []s){ //main method
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);

    }//end of main method
    
    public static int getInt(){ //start of method getInt;
        Scanner scan =new Scanner(System.in);
        
        System.out.print("Enter an int between 1 and 9: "); //prompt user
        int input=checkInt(scan); //checking first if it is an int
        
        input=checkRange(input); //check if the returned value is in range
        
        return input;
        
    }//end of method getInt

    public static int checkInt(Scanner scanner){ //start of checkInt method
    	int result=0;
    	
    	while (!scanner.hasNextInt()) { //while scanner does not take int
    		System.out.print("You did not enter an int; try again: ");
    		scanner.next();     //scanner just taking input, if defined as Int (nextInt) returns error 
		}
		
		result = scanner.nextInt();  
        
        return result;  
        
    }//end of method checkInt
    
    public static int checkRange(int x){
    	Scanner myScanner = new Scanner(System.in);
    	
    	while (x<1 || x>9){ //while input is outside of range
    		System.out.print("You did not enter an int in [1,9]; try again: ");
    		x=checkInt(myScanner); //check if it is an int before moving on
    	}	
    	
    	return x;
    
    }//end of method checkRange
    
    public static void allBlocks(int x){ //start of method allBlocks;
	
    	for (int j=1; j<=x; j++){ //Runs as many times as user input (goes until 4 for user input of 4)
    	
    		block(x, j); 
    	
		}//end of for statement
	}//end of method allBlocks
	
	public static void block(int y, int z){
		//y(line method)=x(block method)
	  
        for (int i=1; i<=z; i++){ //goes as many lines as the number
        	line(z,y); //Prints the number in the format required
        }//end of printing as many lines as the number
        
        
        //separates each BLOCK of same number with lines -----
        for (int k=1; k<=(y-z); k++){ //prints the space necesary to the left to center pattern
            System.out.print(" ");
        }
        for (int l=1; l<=z; l++){ //prints number (a) the number of times as the number (1 time for 1, 2 times for 2)
            System.out.print("-");  //gives 1 22 333 4444
        } 
        for (int l=1; l<=z-1; l++){ //adds additional numbers to make "pyramid"  (b - 1) number of extras (0 extras for 1, 1 for 2)
            System.out.print("-");    //gives 1 222 3333 4444444
        }
        for (int x=1; x<=(y-z); x++){ //prints the space necessary to the right to center pattern
            System.out.print(" ");
        }
        
        System.out.println(); //Skips to next line every loop 
	
	} ///end of method block
	
	public static void line(int a, int b){
				//a is number of loop and b user input
                    
        for (int k=1; k<=(b-a); k++){ //prints the space necesary to the left to center pattern
            System.out.print(" ");
        }
        for (int l=1; l<=a; l++){ //prints number (j) the number of times as the number (1 time for 1, 2 times for 2)
            System.out.print(a);  //gives 1 22 333 4444
        } 
        for (int l=1; l<=a-1; l++){ //adds additional numbers to make "pyramid"  (b - 1) number of extras (0 extras for 1, 1 for 2)
            System.out.print(a);    //gives 1 222 3333 4444444
        }
        for (int x=1; x<=(b-a); x++){ //prints the space necessary to the right to center pattern
            System.out.print(" ");
        }
        
        System.out.println(); //Skips to next line every loop 
                
		
	} //end of method line
    
    
}//end of class