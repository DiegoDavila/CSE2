//Diego Davila
//CSE2
//hw05-BoolaBoola
//create 3 boolean var
//Create random generator
//Random.next
//

import java.util.Scanner;

//Class:
public class BoolaBoola {
    
    //Main method:
    public static void main(String[] args){
        
        boolean one; //boolean variable "one"
        boolean two; //boolean variable "two"
        boolean three; //boolean variable "three"
        
        int r1 = (int) (Math.random()*2); //generated random int 0 or 1 
        
        if (r1==0) { //if random integer 1 is 0
            one = true;
        }
        else {
            one = false;
        }
        
        int r2 = (int) (Math.random()*2); //random int 0 or 1
        
        if (r2==0) { //if rand int 2 is 0
            two = true;
        }
        else {
            two = false;
        } 
        
        int r3 = (int) (Math.random()*2); //random int 0 or 1
        
        if (r3==0) { //if rand int 2 is 0
            three = true;
        }
        else {
            three = false;
        }
        
        //^^This created three random boolean values
        
        Scanner input=new Scanner(System.in); //declaring scanner input
        
        int random4 = (int) ((Math.random()*4)+1); //random int between 1 and 4 to randomly pick a case
        
        switch (random4) { //switch statment for random int between 1 and 4
            
            
            case 1: //case 1: random number is 1
                System.out.print("Does " + one + " && " +two+ " && " +three+ " have the value true (T or t) or false (F or f)? ");
                String userAnswer1=input.nextLine();
                boolean answer1 = (one && two && three); //actual answer to boolean expression
                
                if (answer1==true){ //if the actual answer is true
                    
                    if (userAnswer1.equals("T") || userAnswer1.equals("t")) { //if user answer1 is T or t
                        System.out.println("Correct!");
                    } //end of if user answer equals t
                    else { //if user answer is F or f 
                        System.out.println("Wrong; try again");
                    } //end of else
                    
                } //end of if actual answer is true
                
                if (answer1==false) { //if actual answer is false
                
                    if (userAnswer1.equals("F") || userAnswer1.equals("f")) { //if user answer1 is F or f
                        System.out.println("Correct!");
                    } //end of if user answer equals f
                    else { //if user answer is T or t
                        System.out.println("Wrong; try again");
                    } //end of else 
                    
                } //end of if actual answer is false
            
                break; //break for case 1
                
            case 2:
                System.out.print("Does " + one + " && " +two+ " || " +three+ " have the value true (T or t) or false (F or f)? ");
                String userAnswer2=input.nextLine();
                boolean answer2 = (one && two || three);
                
                if (answer2==true){ //if the actual answer is true
                    
                    if (userAnswer2.equals("T") || userAnswer2.equals("t")) { //if user answer1 is T or t
                        System.out.println("Correct!");
                    } //end of if user answer equals t
                    else { //if user answer is F or f 
                        System.out.println("Wrong; try again");
                    } //end of else
                    
                } //end of if actual answer is true
                
                if (answer2==false) { //if actual answer is false
                
                    if (userAnswer2.equals("F") || userAnswer2.equals("f")) { //if user answer1 is F or f
                        System.out.println("Correct!");
                    } //end of if user answer equals f
                    else { //if user answer is T or t
                        System.out.println("Wrong; try again");
                    } //end of else 
                    
                } //end of if actual answer is false
                
                break; //break for case 2
             
            case 3:
                System.out.print("Does " + one + " || " +two+ " && " +three+ " have the value true (T or t) or false (F or f)? ");
                String userAnswer3=input.nextLine();
                boolean answer3 = (one || two && three);
                
                if (answer3==true){ //if the actual answer is true
                    
                    if (userAnswer3.equals("T") || userAnswer3.equals("t")) { //if user answer1 is T or t
                        System.out.println("Correct!");
                    } //end of if user answer equals t
                    else { //if user answer is F or f 
                        System.out.println("Wrong; try again");
                    } //end of else
                    
                } //end of if actual answer is true
                
                if (answer3==false) { //if actual answer is false
                
                    if (userAnswer3.equals("F") || userAnswer3.equals("f")) { //if user answer1 is F or f
                        System.out.println("Correct!");
                    } //end of if user answer equals f
                    else { //if user answer is T or t
                        System.out.println("Wrong; try again");
                    } //end of else 
                    
                } //end of if actual answer is false

                break; //break for case 3
                
            case 4:
                System.out.print("Does " + one + " || " +two+ " || " +three+ " have the value true (T or t) or false (F or f)? ");
                String userAnswer4=input.nextLine();
                boolean answer4 = (one || two || three);
                
                if (answer4==true){ //if the actual answer is true
                    
                    if (userAnswer4.equals("T") || userAnswer4.equals("t")) { //if user answer1 is T or t
                        System.out.println("Correct!");
                    } //end of if user answer equals t
                    else { //if user answer is F or f 
                        System.out.println("Wrong; try again");
                    } //end of else
                    
                } //end of if actual answer is true
                
                if (answer4==false) { //if actual answer is false
                
                    if (userAnswer4.equals("F") || userAnswer4.equals("f")) { //if user answer1 is F or f
                        System.out.println("Correct!");
                    } //end of if user answer equals f
                    else { //if user answer is T or t
                        System.out.println("Wrong; try again");
                    } //end of else 
                    
                } //end of if actual answer is false

                break;
                
        } //end of switch statment for random4
        
        //^^ by using return I no longer need to user "break" after each case because the program is stopped anyway
        
        
    } //end of main method
    
} //end of class