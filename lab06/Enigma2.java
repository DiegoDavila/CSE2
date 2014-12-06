

import java.util.Scanner;
public class Enigma2{
    
  public static void main(String [] arg){
      
    int n=40,k=60;
    String out="";
    
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: 
    }
    
    System.out.println(out);
    
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 
 * The java.lang exception tells me the line on which the run time error is found 
 and when I go to that line I see it has a number over 0. so I just remove that.
 * 
 * 
 * 
 * 
 */
