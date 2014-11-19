//Diego Davila
//CSE2
//Hw10-FindDuplicates

import java.util.Scanner;
import java.util.Arrays; 

public class FindDuplicates{
    
    public static void main(String [] arg){
        
        Scanner scan=new Scanner(System.in);
        
        int num[]=new int[10];
        String answer="";
        
        do{
            System.out.print("Enter 10 ints- "); //prompt user
            
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt(); //scan 10 user answers
            }
            
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            
            if(hasDups(num)){ //if array num has duplicates "The array +listArray(num)+ has dubplicates"
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            
            out+="duplicates.";
            
            System.out.println(out);
            
            out="The array ";
            out+=listArray(num);   
            
            if(exactlyOneDup(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
      
        }while(answer.equals("Y") || answer.equals("y")); //while the user enters Y or y
        
    }//end of main method

    public static String listArray(int num[]){
        String out="{";
        
        for(int j=0;j<num.length;j++){
            
            if(j>0){
                out+=", ";
            }//end of if statment
        
            out+=num[j];
            
        }//end of for loop
        
    out+="} ";
    return out;
    
    }//end of method listArray
    
    
    public static boolean hasDups(int num[]){
        
        boolean result=false;
        
 
        for (int i=0; i<num.length; i++){
            
            for (int j=0; j<num.length; j++){
                
                if (j!=i && num[j] == num[i]){
                    result=true;
                }
            
            }
        }
        return result;
        
    }//end of method hasDups
    
    
    public static boolean exactlyOneDup(int num[]){
        
        Arrays.sort(num);
        
        boolean result=false;
        int repetitions=0;
        
        for(int i=0; i<num.length-1; i++){ //for every number on the array
            
            if (num[i]==num[i+1]){
                repetitions++;
            }
    
        }//end of for loop to test every number
        
           if(repetitions!=1){
                result=false;
            }
            else{
            	result=true;
            }
        
        return result;
        
    }//end of method exactlyOneDup
  
  
}//end of class
