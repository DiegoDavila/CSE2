//Diego Davila
//CSE2 
//hw06-Roulette
//Purpose: Simulate Roulette game 
//For the 1000 REPETITIONS of the simulation:
//1. Compute number of times everything is lost (number never comes up in 100 times)
//2. Compute the number of times there was a profit (same number at least 3 times in 100 spins)
//3, Compute total profit of 1000 repetitions of 100-spin simulation
//Steps:
//Loop for 1000 simulation outside everything and do it at the end
    //Loop for betting 100 spins
        //Generate random number bet between 0 and 37 for random bet
        //Generate random number outcome between 0 and 37 for random outcome
        //if bet=outcome then win and add 36 to winnings in 100 spin AND 36 to total winnings in 1000 simulations
        //(total winnings in 1000 sim must be oustide loops for scope) 
        //(total winnings in 100 spins must be INSIDE loop for 1000 sim to limit scope)
    //end loop 100 
//if total winnings in 100 spins is 0 then add one to times you lost everything in 100 spins out of 1000 sim
//if total winnings is greater than 108 add one to times you won a profit in 100 spins out of 1000 sim

        
        
        
//Class:
public class Roulette{
    
    //main method:
    public static void main(String[] args){
        
        
        //Start Loop for 1000 simulations:
        
        int loopThousand=1; //var that will make sure 1000 simulations are done
        int lostEverything=0; //var for the number of times in 1000 simulations no money was made
        int timesProfit=0; //var for number of times in 1000 simulations that profit (more than $108) were made
        int totalWinnings=0; //var for total money made in 1000 simulations (does NOT indicate profit, just money made assuming $0 bet)
        
        //Start loop for 1000 simulation of 100 spins
        while (loopThousand<=1000) {
            int loop100=1; //var will make sure 100 spins are done
            int wallet=0; //var for total money made in 100 spins (does NOT indicate profit just the money made assuming $0 bet)
        
            while (loop100<=100){ //loop for 100-spin game (ONE SIMULATION)
                int bet = (int)((Math.random())*38); //random var for the bet 
                int outcome = (int)((Math.random())*38); //random var for the roulette outcome
                
                if (bet==outcome){ //if the random number bet is equal to the random roulette outcome
                    wallet=(wallet + 36); //adding $36 to the money made in 100 spins
                    totalWinnings=(totalWinnings + 36); //adding $36 to the TOTAL money made in 1000 simulations
                } //end of if bet=outcome   
        
                loop100++; //adds 1 to loop100 until 100 spins are reached
            }// end of loop for 100 spin simulation
            
            if (wallet==0) { //if no money was made (bet never equaled outcome in 100 spins)
                lostEverything++; //add one to the number of times you lost everything in 1000 simulations
            }
            
            if (wallet>=108) { //if money made in 100 spins was over $108 (profit was made)
                timesProfit++; //add one to the number of times you got a profit in 1000 simulations
            }
            
            loopThousand++; 
        } //end of loop for 1000 simulations
        
        System.out.println("Number of times you lost everything: " + lostEverything); //print number of times you lost everything in 1000 sim
        System.out.println("Number of times you got a profit: " + timesProfit); //print number of times you made a profit in 1000 sim
        System.out.println("Total winnings made in 1000 runs of 100-spin game: $" + totalWinnings); //print totalWinnings in 1000 sim
        
        int total=(totalWinnings-100000); //total "profit" made assuming $1 bet for 100spins done 1000 times ($100,000 dollar bet)
        
        if (total<=0) { //if the total winnings in 1000 sim is less than the $100,000 of the 1000 sim
            System.out.println("You did not make any profit. You lost $" + -1*total + " dollars of the $100,000 you bet");
        }
        else {
            System.out.println("Congratulations! You made a profit of " +total+ " after playing 100 spins of roulette 1000 times");
        }
        
    }//end of main method
}//End of class