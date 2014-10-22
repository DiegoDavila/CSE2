//Diego Davila
//CSE2
//lab08-MoreLoops


import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
        
	Scanner scan=new Scanner(System.in);
	int n=0;

	System.out.print("Enter an int- ");
	while(!scan.hasNextInt()){
	    scan.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- ");
	}
	//COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A 
	//DO-WHILE LOOP
        n=scan.nextInt();

	
	int j=0; //declaring j
	while(j<n && j<40){ //conditions for loop identical to for
	    int k=0;
	    while(k<j+1){
		System.out.print('*');
		k++;
	    }
	    System.out.println();
	    j++; //adding one to j. 
	    //only necessary to take initialization and variable++ out of for loop
	}
	//COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
	//WHILE STATEMENTS
      
	int k=4;

	while (k<=4){ //while k is less than or equals to 4
	    System.out.println("k="+k);
	    k++; //adds one so that loop is only done once
	}
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
	//WITH A WHILE LOOP

        int count=0;
        
        for (int i=1; i>0; i++){
	   
            if (n==2){
                System.out.print("Case 2 "); 
		        continue;
            }
            else if (n==3) {
                break;
            }
            else if (n==4) {
                System.out.println("Case 4");
                System.out.println("Case 5");
            }
            else if (n==5) {
                System.out.println("Case 5");
            }
            else {
                System.out.println(n + " is > 5 or <1");
		        break;
            }
	    
	    count++;
	    if(count>10)
		break;
	    
	    }
	    
	   
	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }
}