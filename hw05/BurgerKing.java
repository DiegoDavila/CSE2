//Diego Davila
//CSE2
//hw05-BurgerKing
//Purpose: Take order from customer

import java.util.Scanner; //import scanner class

//Class:
public class BurgerKing{
    
    //Method:
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in); //declaring scanner as "input"
        
        System.out.print( "Enter a letter to indicate your choice of\n" +
        "Burger (B or b)\nSoda (S or s)\nFries (F or f)\n");
        String choice = input.nextLine();
        
        if (choice.length()==1){ //if lenght of string is one 
        
            switch (choice) { //switch statment for choice
            
                case "B":case "b": //if user entered B or b
                    System.out.print("Enter A  or a \"for all fixins\"\nC or c for cheese\n" + //ask user for fixins
                    "N or n for none of the above\n");
                    String burger= input.nextLine();
                    
                        switch (burger) { //switch statment for burger choice
                            case "A":case "a":
                                System.out.println("You ordered a burger with all the fixins."); //if user entered A or a
                                break;
                            case "C": case "c":
                                System.out.println("You ordered a burger with cheese."); //if user entered C or c
                                break;
                            case "N":case "n":
                                System.out.println("You order a burger with no fixins."); //if user entered N or n
                                break;
                            default:
                                System.out.println("You did not enter one of 'A', 'a', 'C', 'c', 'N', or 'n'"); //if user did not enter one of the options
                                break;
                          } // end of switch statement for burger choice
                    break; //break for burger
                
                case "S":case "s": //if user entered S or s
                    System.out.print("What kind of soda do you want?\nPepsi (P or p)\nCoke (C or c)\n" + //ask user for soda type
                    "Sprite (S or s)\nMountain Dew (M or m)\n");
                    String soda=input.nextLine();
                        
                        switch (soda) { //switch statment for soda 
                            case "P":case "p":
                                System.out.println("You ordered a Pepsi"); //if user entered P or p
                                break;
                            case "C":case "c":
                                System.out.println("You ordered a Coke"); //if user entered C or c
                                break;
                            case "S":case "s":
                                System.out.println("You ordered a Sprite"); //if user entered S or s
                                break; 
                            case "M":case "m":
                                System.out.println("You ordered a Mountain Dew"); //if user entered M or m
                                break;
                            default:
                                System.out.println("You did not enter one of 'P', 'p', 'C', 'c', 'S', 's', 'M', or 'm'");
                                break;
                        } //end of switch statment for soda
                    break; //break for Soda
                    
                case "F":case "f": //if user entered f or F
                    System.out.print("Do you want a large (L or l) or a small (S or s) order of fries?\n");
                    String fries=input.nextLine();
                    
                        switch (fries) { //switch statment for fries 
                            case "L":case "l":
                                System.out.println("You ordered large fries");
                                break;
                            case "S":case "s":
                                System.out.println("You ordered small fries");
                                break;
                            default:
                                System.out.println("You did not enter one of 'L', 'l', 'S', or 's'");
                                break;
                        } //end of switch statment for fries 
                    break; //break for Fries
                    
                default:
                    System.out.println("You did not enter one of 'B', 'b', 'S', 's', 'F', or 'f'");
                    break;
                    
                
            } //end of switch statment for choice
            
        } //end of if 
        
        else { // else --if user did not enter a single character 
            System.out.println("You did not enter a single character");
            return;
        } //end of else statment
        
        
    } //end of main method
}//end of class
    
