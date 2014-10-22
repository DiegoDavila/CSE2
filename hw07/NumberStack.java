//Diego Davila
//CSE2
//hw07-NumberStack

import java.util.Scanner;

//class
public class NumberStack{
    
    //method
    public static void main(String [] args){
        
        Scanner scan =new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 9: ");
        int number=scan.nextInt();
        
        while (number<1 || number>9) {
            System.out.println("You did not enter an integer between 1 and 9");
        	System.out.print("Enter an int between 1 and 9: ");
    		number = scan.nextInt();
        }
        
        System.out.println("Using for loops: \n" + " ");
        
            for (int j=1; j<=number; j++){ //Runs as many times as user input (goes until 4 for user input of 4)
                
                for (int i=1; i<=j; i++){ //prints as many lines of each number as the number (1 line for 1, 2 lines for 2...)
                    
                    for (int k=1; k<=(number-j); k++){ //prints the space necesary to the left to center pattern
                        System.out.print(" ");
                    }
                    for (int l=1; l<=j; l++){ //prints number (j) the number of times as the number (1 time for 1, 2 times for 2)
                        System.out.print(j);  //gives 1 22 333 4444
                    } 
                    for (int l=1; l<=j-1; l++){ //adds additional numbers to make "pyramid"  (number - 1) number of extras (0 extras for 1, 1 for 2)
                        System.out.print(j);    //gives 1 222 3333 4444444
                    }
                    for (int x=1; x<=(number-j); x++){ //prints the space necessary to the right to center pattern
                        System.out.print(" ");
                    }
                    System.out.println(); //Skips to next line every loop 
                }
                
                    //Now I need to do the exact same for "-" instead of j and printing only ONE line
                    //All of this before the loop ends and goes to the next number j.
                    
                    for (int k=1; k<=(number-j); k++){ //prints the space necesary to the left to center pattern
                        System.out.print(" ");
                    }
                    for (int l=1; l<=j; l++){ //prints number (j) the number of times as the number (1 time for 1, 2 times for 2)
                        System.out.print("-");  //gives 1 22 333 4444
                    } 
                    for (int l=1; l<=j-1; l++){ //adds additional numbers to make "pyramid"  (number - 1) number of extras (0 extras for 1, 1 for 2)
                        System.out.print("-");    //gives 1 222 3333 4444444
                    }
                    for (int x=1; x<=(number-j); x++){ //prints the space necessary to the right to center pattern
                        System.out.print(" ");
                    }
                    System.out.println(); //Skips to next line every loop 
                    
            }
            
        System.out.println();
        System.out.println("Using while loops: \n" + " ");
    //Changing from for to while: just taking out the var initialization placing it before loop and placing addition (j++) inside loop at the end
        
        int j=1;
        while (j<=number){ //Runs as many times as user input (goes until 4 for user input of 4)
                int i=1;
                while (i<=j){ //prints as many lines of each number as the number (1 line for 1, 2 lines for 2...)
                    int k=1;
                    while (k<=(number-j)){ //prints the space necesary to the left to center pattern
                        System.out.print(" ");
                        k++;
                    }
                    int l=1;
                    while (l<=j){ //prints number (j) the number of times as the number (1 time for 1, 2 times for 2)
                        System.out.print(j);  //gives 1 22 333 4444
                        l++;
                    } 
                    l=1;
                    while (l<=j-1){ //adds additional numbers to make "pyramid"  (number - 1) number of extras (0 extras for 1, 1 for 2)
                        System.out.print(j);    //gives 1 222 3333 4444444
                        l++;
                    }
                    int x=1;
                    while (x<=(number-j)){ //prints the space necessary to the right to center pattern
                        System.out.print(" ");
                        x++;
                    }
                    System.out.println(); //Skips to next line every loop \
                    i++;
                }
                
                    //Now I need to do the exact same for "-" instead of j and printing only ONE line
                    //All of this before the loop ends and goes to the next number j.
                    int k=1; //all these variables must be initialized b/c they are out of scope
                    while (k<=(number-j)){ //prints the space necesary to the left to center pattern
                        System.out.print(" ");
                        k++;
                    }
                    int l=1;
                    while (l<=j){ //prints number (j) the number of times as the number (1 time for 1, 2 times for 2)
                        System.out.print("-");  //gives 1 22 333 4444
                        l++;
                    } 
                    l=1;
                    while (l<=j-1){ //adds additional numbers to make "pyramid"  (number - 1) number of extras (0 extras for 1, 1 for 2)
                        System.out.print("-");    //gives 1 222 3333 4444444
                        l++;
                    }
                    int x=1;
                    while (x<=(number-j)){ //prints the space necessary to the right to center pattern
                        System.out.print(" ");
                        x++;
                    }
                    System.out.println(); //Skips to next line every loop 
            
                j++;        
            }
            
            System.out.println();
        System.out.println("Using do-while loops: \n" + " ");
    //Changing from while to do while: do the same thing but add ifs to condition certain executions to avoid extra spacing or numbers
        
        j=1;
        do{ //Runs as many times as user input (goes until 4 for user input of 4)
                int i=1;
                do{ //prints as many lines of each number as the number (1 line for 1, 2 lines for 2...)
                    int k=1;
                    do{ //prints the space necesary to the left to center pattern
                        if (j!=number){ //to avoid making spacing on the last set of numbers
                        System.out.print(" ");
                        k++;
                        }
                    }while (k<=(number-j) && j!=number);
                    int l=1;
                    do{ //prints number (j) the number of times as the number (1 time for 1, 2 times for 2)
                        System.out.print(j);  //gives 1 22 333 4444
                        l++;
                    }while (l<=j);
                    l=1;
                    do{ //adds additional numbers to make "pyramid"  (number - 1) number of extras (0 extras for 1, 1 for 2)
                        if (j-1!=0){ //to avoid loop executing for j=1 to give 0 extras to 1
                        System.out.print(j);    //gives 1 222 3333 4444444
                        l++;
                        }
                    }while (l<=j-1);
                    int x=1;
                    do{ //prints the space necessary to the right to center pattern
                        System.out.print(" ");
                        x++;
                    }while (x<=(number-j));
                    System.out.println(); //Skips to next line every loop \
                    i++;
                }while (i<=j);
                
                    //Now I need to do the exact same for "-" instead of j and printing only ONE line
                    //All of this before the loop ends and goes to the next number j.
                    int k=1; //all these variables must be initialized b/c they are out of scope
                    do{ //prints the space necesary to the left to center pattern
                        if (j!=number){ //to avoid making spacing on the last line 
                        System.out.print(" ");
                        k++;
                        }
                    }while (k<=(number-j));
                    int l=1;
                    do{ //prints number (j) the number of times as the number (1 time for 1, 2 times for 2)
                        System.out.print("-");  //gives 1 22 333 4444
                        l++;
                    }while (l<=j); 
                    l=1;
                   do{ //adds additional numbers to make "pyramid"  (number - 1) number of extras (0 extras for 1, 1 for 2)
                       if (j-1!=0){ //to avoid extra "-" on first part 
                        System.out.print("-");    //gives 1 222 3333 4444444
                        l++;
                        }
                    }while (l<=j-1);
                    int x=1;
                    do{ //prints the space necessary to the right to center pattern
                        System.out.print(" ");
                        x++;
                    }while (x<=(number-j));
                    System.out.println(); //Skips to next line every loop 
            
                j++;        
            }while (j<=number);
        
        
    }//end of main method
}//end of class