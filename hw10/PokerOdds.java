

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }//end of main method
    
    
    public static void showHands(){
        
        Scanner scan=new Scanner(System.in);
        String answer="";
        
        do{
            int [] cardDeck = new int[52];
            
            for (int i=0; i<cardDeck.length; i++){
                cardDeck[i]=i;
            }
            
            int [] hand = new int [5];
            
            for (int i=0; i<hand.length; i++){
                hand[i]=-1;
            }
            
            int j=52; 
            
            for (int i=0; i<hand.length; i++){
            	
                int n=(int)(Math.random()*j);
                
                hand[i]=cardDeck[n];
                
                if(n<51){
                    for (int k=n; n<j-1; n++){
                        cardDeck[n]=cardDeck[n+1];
                    }
                    cardDeck[n]=-1;
                }
                
                else{
                    cardDeck[n]=-1;
                }
                
                j--;
        	}
        	
            String [] ranks = {"A", "K", "Q", "J", "10", "9", "8", "7", "6","5","4", "3","2"}; //String array for ranks
            
            String [] suits = {"Clubs", "Dimonds", "Hearts", "Spades"}; //String array for suits
            
            for(int i=0;i<4;i++){ 
                
                String ranksDisplay="";
                
                for(int k=0; k<hand.length; k++){
                
                	int number=hand[k];
                	int suitNumber=(int)(number/13);
                	int rankNumber=number%13;
                
        			if(suitNumber==i){
        			
        				ranksDisplay+=" " + ranks[rankNumber];
        			
        			}
        			else{
        				continue;
        			}
        			                
                }
                
                 System.out.println(suits[i]+":"+ranksDisplay); 
            }
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
      
        }while(answer.equals("Y") || answer.equals("y")); //while the user enters Y or y
        
    
    }//end of method showHands()
    
    
    public static void simulateOdds(){
        
         int [] counts = new int[14]; //creating an array to store the counts for pairs and for not a pair
            
            for(int p=0; p<14; p++){ //before everything make that array have only zeroes. 
                
                counts[p]=0;
                
            }
        
        for(int simulation=1; simulation<=10000; simulation++){ //Loop for generating 10000 hands
            
            /*first copy the code from showHands() that generates the random poker hand
            without worrying about the suits since we are only looking for hands where 
            a pair (call exactlyOneDup) of the same rank occur.
            */
            
            int [] cardDeck = new int[52];
            
            for (int i=0; i<cardDeck.length; i++){
                cardDeck[i]=i;
            }
            
            int [] hand = new int [5];
            
            for (int i=0; i<hand.length; i++){
                hand[i]=-1;
            }
            
            int j=52; 
            
            for (int i=0; i<hand.length; i++){
            	
                int n=(int)(Math.random()*j);
                
                hand[i]=cardDeck[n];
                
                if(n<51){
                    for (int k=n; n<j-1; n++){
                        cardDeck[n]=cardDeck[n+1];
                    }
                    cardDeck[n]=-1;
                }
                
                else{
                    cardDeck[n]=-1;
                }
                
                j--;
        	}
        	
            
            //set an array for the number corresponding to the rank to test it with exactlyOneDup
            int [] handInNumbers=new int[5];
            
            for (int i=0; i<hand.length; i++){ //make my hand be in the numbers corresponding to the rank
                
                int number=hand[i];
                int rankNumber=number%13;
                handInNumbers[i]=rankNumber;
                
            }
            
            
            if(FindDuplicates.exactlyOneDup(handInNumbers)){ //if we prove the hand has exactly one pair of equal numbers
                
                Arrays.sort(handInNumbers); //sort the array to easily check which value is repeated
                
                for(int k=0; k<handInNumbers.length-1; k++){ //loop to check for all values of the hand
                
        			if(handInNumbers[k]==handInNumbers[k+1]){ 
        			/*if the current value is the same as the next. if this is true, since
        			our array is sorted and we already proved we have only one duplicate, 
        			then handsInNumber[k] is the value of our duplicate where 0=A, 1=K, etc. */
        			
        				int position = handInNumbers[k]; //the position of the real rank
        				counts[position]++; //go to the counter and add one
        			
        			} //end of if
        			else{ //if it is not equal just continue the loop
        				continue;
        			}
        			                
                }//end of loop to check the hand
                
            }
            else{ //if the hand does not have exactly one pair then add one to the last position of array counts
                counts[13]++; //position 13 in counts corresponds to "not exactly one pair" (0-12 are the ranks)
            }
            
        }//end of for loop for 10000 hands
        
        String [] ranks = {"A", "K", "Q", "J", "10", "9", "8", "7", "6","5","4", "3","2"}; //String array for ranks
        
        System.out.println("Rank  Frequency of exactly one pair");
        
        for(int j=0;j<ranks.length; j++){ 
            
            System.out.println(ranks[j]+":   "+counts[j]); 
            
        }
        
        System.out.println("------------------");
        System.out.println("Total not exactly one pair: " +counts[13]);
        
    }//end of method simulateOdds()
    
    
    
}//end of class
