/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0{
    
  public static void main(String[] arg){
    
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    int n; 
    
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:

 2. variable "n" was not properly initialized to be used later in the line "To repeat..." "n" must be initialized before 
 taking user input. In addition, variable n was initialized twice (once inside if and once inside else) - it should only
 be initialized once
 3. case24 was unncessary because k+p+q+r will always equal 25
 *   Explain the error(s) that occurred here, and then fix them
 */