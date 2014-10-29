//Diego Davila 
//CSE 2
//lab09-Methods 


import java.util.Scanner;

//Class: 
public class Methods{
    
    //Main method:
    public static void main(String [] arg){
        
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three ints");
        a=getInt(scan);
        b=getInt(scan);
        c=getInt(scan);
        
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
                       
  }//end of main method
    
    public static int getInt(Scanner x){
    
        while(!x.hasNextInt()) {
            System.out.println("You did not enter an int, try again: ");
            x.nextInt(); 
        }
        
        return x.nextInt();
        
        
    }//end of method getInt
    
    public static int larger(int x, int y){
        if (x>y){
            return x;
        }
        else{
            return y;
        }
    }//end of method larger
  
    public static boolean ascending(int x, int y, int z){
         
         if (x<y && y<z && x<z){
             return true;
         }
         else{
             return false;
         }
        
    }//end of method ascending
  
}//end of class