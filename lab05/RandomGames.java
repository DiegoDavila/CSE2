//Diego Davila
//CSE2
//lab05-RandomGames
//Purpose: Give a game upon request
//User chooses between Roulette, Craps or Picking a card
//Program runs the game


import java.util.Scanner; //import Scanner class

//Class:
public class RandomGames{
    
    //Main method:
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in); //Declaring scanner as "input" 
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        String game=input.nextLine();
        
        if (game.length() == 1) { //if lenght of string equals one
            
            switch (game) { //start of switch statement for game
                
                case "R": case "r": //if user entered R or r
                    System.out.println("You chose Roulette");
                    
                    int rNumber=(int)((Math.random())*38); //Generating random number from 0 to 37
                    
                    if (rNumber==37) { //if random int equals 37
                    
                        System.out.println("Roulette: 00"); //If the int generated is 37 the program will display 00
                        
                    } //end of if
                    
                    else{ //if rNumber does not equal 37
                   
                    System.out.println("Roulette: " +rNumber); //Displaying random number from 0 to 36
                    
                    } //end of else statment
                    
                    break; //break case R or r
                
                case "C": case "c": //if user entered C or C
                    System.out.println("You chose Craps");
                    
                    int roll1=(int)((Math.random()*6)+1); //random roll of dice 1
                    int roll2=(int)((Math.random()*6)+1); //random roll of dice 2
                    
                    System.out.println("Craps: " +roll1+ "+" +roll2+ "=" +(roll1+roll2));
                    
                    break; //break case R or r
                
                case "P": case "p":   //if user entered P or p
                    System.out.println("You chose pick a card");
                    
                    int suit=(int)((Math.random()*4)+1); //random suit
                    int cardNumber=(int)((Math.random()*13)+1); //random card
                    String card; //Declaring String variable card
                    
                    switch (cardNumber) { //switch statment for cardNumber
                        case 1: 
                            card= "Ace"; //if cardNumber=1 it is an Ace
                            break;
                        case 11: 
                            card= "Jack"; //if cardNumber=11 it is a Jack
                            break;
                        case 12:
                            card= "Queen"; //if cardNumber=12 it is a Queen
                            break;
                        case 13:
                            card= "King"; //if cardNumber=13 it is a Queen
                            break;
                        default:
                            card= "" + cardNumber; //otherwise the card is the random number
                            break;
                    
                    } //end of switch for cardNumber
                    
                    switch (suit) { // switch statment for card suit 
                        
                        case 1: 
                            System.out.println(card+ " of Clubs"); //if suit=1 it is a Club
                            break;
                        case 2: 
                            System.out.println(card+ " of Dimonds"); //if suit=2 it is a Dimond
                            break;
                        case 3:
                            System.out.println(card + " of Hearts"); //if suit=3 it is a Heart
                            break;
                        case 4: 
                            System.out.println(card+ " of Spades"); //if suit=4 it is a Spade
                            break;
                    
                    } //end of switch statment for card suit
                    
                    break; //break case P or p
                
                default:
                    System.out.println("You did not enter one of 'R', 'r', 'C', 'c', 'P', or 'p'.");
                    break;
            
            } // end of switch statment for game
        
            
        } //end of if
        
        else { //else (If user did NOT enter a string)
            System.out.println("You did not enter a valid string of lenght one."); 
            return;
        } //end of else
        
        
        
        
    } //end of main method
} //end of class