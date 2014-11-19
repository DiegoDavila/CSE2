//Diego Davila
//CSE2
//lab11-Arrays

import java.util.Scanner;

public class Arrays{
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        int [] list = new int[10];
        
        System.out.print("Enter 10 ints: ");
        
        for(int i=0; i<list.length; i++){

            list[i]=scan.nextInt();
        
        }
        
        int min=list[0];
        for (int i=0; i<list.length; i++){
            if (list[i]<min){
                min=list[i];
            }
        }
        
        int max=list[0];
        for (int i=0; i<list.length; i++){
            if (list[i]>max){
                max=list[i];
            }
        }
        
        int sum=0;
        for (int i=0; i<list.length; i++){
            sum+=list[i];
        }
        
        int [] list2 = new int[list.length]; 
        int l = list.length-1;
        for (int i=0; i<list.length; i++){
            list2[i]=list[l-i];
        }
        
        System.out.println("The minimum value is " +min);
        System.out.println("The maximum value is " +max);
        System.out.println("The sum is " +sum);
        
        System.out.println("The array is:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " " + list2[i]);
        }
        
    }//end of main method
}//end of class