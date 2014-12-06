//Diego Davila
//CSE 2
//hw 11- Poker Hands


import java.util.Scanner;
import java.util.Arrays; //import array method to test code while writing it

public class PokerHands{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String answer="";
        
        do{
            
            
            String suit="";
            String rank="";
            int []  hand = new int [5];
            
            for(int i=0; i<5; i++){ //get five cards
            
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");
                suit=getSuit(scan);
                
                System.out.print("Enter the rank; one of 'a', 'k', 'q', 'j', '10', ...'2': ");
                rank=scan.next();
                
                int cardNumber=getCard(suit, rank); //call method to get the card in number representation (0-51)
                
                if(i==0){
                    hand[i]=cardNumber;
                }
                else{
                    
                    for(int j=0; j<i; j++){ //check if user already entered that card (check all the array before current position)
                    
                        if(cardNumber==hand[j]){ //if user already entered that card
                            System.out.println("You already entered that card.");
                            i--; //subtract from i to avoid ending the outer loop before completing the hand
                        }
                        else{
                            hand[i]=cardNumber;  
                        }
                    
                    }
                }
            }//end of for loop to get hand
            
            
            showOneHand(hand);
            
            //Creating rankFreq to count rank frequencies
            int [] rankFreq = new int [13]; //array of size 13 to cound frequency of ranks
        
            for(int i=0; i<rankFreq.length; i++){ //make all of array result be 0
                rankFreq[i]=0;
            }
        
            for(int i=0; i<hand.length; i++){
            
                int rankNumber=hand[i]%13;
                rankFreq[rankNumber]++;
            
            } 
            //End of snipet of creating rankFreq
            
            //Create frequency array to count the frequency of 0s, 1s, 2s, and 3s
            int [] frequency = new int [5];
            for(int i=0; i<frequency.length; i++){ //make all of the array be 0
                frequency[i]=0;
            }
            
            for(int j=0; j<5; j++){
                
                    for (int i=0; i<rankFreq.length; i++){
                
                        if(rankFreq[i]==j){
                           frequency[j]++;
                        }
                
                    }
            }
            
            //USED FOR CHECKING
           // System.out.println("rank frequency array: " +Arrays.toString(rankFreq));
           // System.out.println("frequency: " + Arrays.toString(frequency));
            
            String result=getHand(hand, frequency);
            
            System.out.println("This is a "+result);
            
            System.out.print("Enter 'y' or 'Y' to enter another hand: "); //ask if user wants to run again
            answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y")); //while the user enters Y or y
        
        
    }//end of main method
    
    
    
    public static void showOneHand(int hand[]){
        String suit[]={"Clubs:    ", "Diamonds: ", "Hearts:   ","Spades:   "};
        String face[]={
            "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
            "4 ","3 ","2 "};
        String out="";
        
    for(int s=0;s<4;s++){
      out+=suit[s];
      for(int rank=0;rank<13;rank++)
        for(int card=0;card<5;card++)
         if(hand[card]/13==s && hand[card]%13==rank)
          out+=face[rank];
      out+='\n';
    }
    System.out.println(out);
    
    }//end of method showOneHand
    
    public static String getSuit(Scanner x){ //check validity of user input for suit
    
        String answer = x.next();
        
        while(!answer.equals("c") && !answer.equals("d") && !answer.equals("h") && !answer.equals("s")) {
            System.out.println("You did not enter a valid input");
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's': ");
            answer=x.next(); 
        }
        
        return answer;
        
        
    }//end of method getInt
    
    public static int getCard(String suit, String rank){ //method used to get the card number from 0 to 51
        
        /*int representation of card must be between 0 and 51
        1. Turn string to number representation by looking at place in array
        2. Multiply suit by 13 to get range (if 0, 0<=card<=12, if 1, 13<=card<=25,...) 
        3. check in the range which number gives remainder = rankNumber
        */
        
        String [] suitArray ={"c", "d", "h","s"};
        String [] face ={"a","k","q","j","10","9","8","7","6","5","4","3","2"};
        
        int suitNumber=-1;
        int rankNumber=-1;
        int card=-1;
        
        for(int i=0; i<suitArray.length; i++){ //loop to get suit number or (int)card/13
            
            if(suit.equals(suitArray[i])){ //if suit from hand equals suit from the Array
                suitNumber=i; //assign the number representation to the suit (0-3)
                break;
            }
        }
        
        for(int i=0; i<face.length; i++){ //loop to get rankNumber or card%13
            
            if(rank.equals(face[i])){ //if the rank from hand equals rank from Array
                rankNumber=i; //assign the number representation to rank (0-12)
                break;
            }
        }
        
        switch (suitNumber){ //switch statment for suitNumber
            
            //switch statment used to get the card number from 0 to 51 
        
            case 0: card=rankNumber;  //if suit is 0 then the rank Number is the card
                break;
            case 1: card=rankNumber+13;
                break;
            case 2: card=rankNumber+26;
                break;
            case 3: card=rankNumber+39;
                break;
        
        }//end of switch statment for suitNumber
        
        return card;
        
    }//end of method getCard
    

    public static String getHand(int[] hand, int [] frequency){
        /* The rank of winning hands from best to worst are:  
        -----Royal Flush (a straight flush of the form A, K, Q, J, 10) {8,5,0,0}----
        -----Straight Flush (e.g., 10,9,8,7,6 with the same suit) {8,5,0,0}-----
        Four of a Kind (e.g., 6, 6, 6, 6, 3) {11,1,0,1}
        Full House (e.g., 6,6,6,3,3) {11,0,1,1,0}
        -----Flush (five cards of same suit)----- 
        -----Straight (e.g., 8, 9, 10, J, Q) {8,5,0,0,0}-------
       ------ Two Pair (e.g., 5, 5, 3, 3, 2)  {10,1,2,0,0}------
        -----One Pair (e.g., 2, 2, 3, 8, K)  {9,3,1,0,0}------
        -----High Card (five cards with different suits and different ranks and not a straight). {8,5,0,0,0}-----
        */
        
       // String [] suitArray ={"c", "d", "h","s"}; REFERENCE
        //String [] face ={"a","k","q","j","10","9","8","7","6","5","4","3","2"};
        
        //first sort the hand from least to greatest:
        for(int k=0; k<hand.length-1; k++){
            
        	for(int j=0; j<hand.length-1; j++){
                
                if(hand[j]>hand[j+1]){
                    
                    int greater=hand[j];
                    int lesser=hand[j+1];
                    
                    hand[j]=lesser;
                    hand[j+1]=greater;
                }   
            
            }
            
        }
        //end of code to sort
        
        String result="";
      
        //Check if all cards have the same suit first to narrow down 
        boolean sameSuit=false;
        for (int i=0; i<hand.length-1; i++){
            
            if(hand[i]/13==hand[i+1]/13){
                sameSuit=true;
            }
            else{
                sameSuit=false;
                break;
            }
            
        }
        //end of code to check for the same suit
        
        if(sameSuit){ //narrowed to: Royal Flush, Straight Flush and Flush
            
            for(int i=0; i<hand.length-1; i++){
                if(hand[0]%13==0 && hand[i]%13+1==hand[i+1]%13){
                    result="Royal Flush";
                }
                else if(hand[0]%13 != 0 && hand[i]%13+1==hand[i+1]%13){
                    result="Straight Flush";
                }
                else{
                    result="Flush";
                }
            }//end of for loop
            
        }//end of if same suit
        else{
            
            if(frequency[0]==8){                    //(0, 1, 2, 3,  4, 5, 6, 7 )
                                                    //(a, k, q, j, 10, 9, 8, 7,...)
                //for(int i=0; i<hand.length-1; i++){ //(A,K,Q,J,10) (A,K,J,10,9)
                
                    //String [] face ={"a","k","q","j","10","9","8","7","6","5","4","3","2"};
                
                    if(hand[0]%13+4==hand[4]%13){ //(2,3,4,5,6)
                        result="Straight";
                    }
                    else{
                        result="High Card";
                    }
               // }//end of for loop
            }//end of if frequency[0]=8
            
            else if(frequency[0]==9){
                result="One Pair";
            }
            else if(frequency[0]==10){
                result="Two Pair";
            }
            else if(frequency[0]==11){
                
                
	               
		            if(hand[0]%13==hand[3]%13 || hand[1]%13==hand[4]%13){
		                result = "Four of a Kind";
	                }
	                else{
	                    result="Full House";
	                   
	                }
                    
                
                
            }//end of else if freq=11
            
        }//end of else for same suit
        
        return result;

        
    }//end of method get hand
    
}//end of class