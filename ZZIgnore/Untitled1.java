import java.util.Scanner; //import scanner to ask user for input

//Class:
public class Untitled1{
    
    //Main method:
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in); //Declarin scanner variable name "input"
    
    System.out.print("Enter a double and I display four digits to the right of the decimal point: ");
        double n=input.nextDouble();
        
    int nInt=(int)n; //Cast double n to an int 
    
    double nThousand=(n*10000)%10000; //Multiply double n by 10000 
    int nIntThousand=nInt*10000; //Casting double multiplied by 10000
    int Subtraction=((int)nThousand-nIntThousand);
    
    System.out.println("The four digits are: " + nThousand);
    
        
    
       
        
    } //End of main method
} //end of class