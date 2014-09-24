//Diego Davila
//CSE1
//hw04-CourseNumber
//Purpose: Gives semester and year a class was offered 
//Steps:
//1. Ask user for 6 digit int code for class
//2. Divide by 100 and get remainder to get class
//3. Divide by 100 and cast to int to get year

import java.util.Scanner;
import java.text.DecimalFormat;

//Class:
public class CourseNumber{
    
    //Main method:
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter six digit number giving the course semester: ");
        int course;
        
        
        if (input.hasNextInt()) { //if user input is an integer
            course=input.nextInt();
             
            if (course>=186510 & course<=201440) { //if user input is in the range [186510, 201440]
                
                int year=(int) (course/100);
                int semester=(int) (course%100);
                
                switch (semester){ //start of switch statment
                    
                    case 10:
                        System.out.println("The course was offered in the Spring semester of " +year);
                        break;
                    case 20: 
                        System.out.println("The course was offered in the Summer 1 semester of " +year);
                        break;
                    case 30:
                        System.out.println("The course was offered in the Summer 2 semester of " +year);
                        break;
                    case 40:
                        System.out.println("The course was offered in the Fall semester of " +year);
                        break;
                    default:
                        System.out.println(semester+ " is not a legitimate semester.");
                        break;
                
                } //end of switch statment
            
            }//end of if statment of range
            
            else { //else -- if user gave number outside range
                System.out.println("The number was outside the range [186510, 201440]");
                return;
            }
            
        } //end of if statement of int
        
        else { //Else -- if user did not input int
            System.out.println("Invalid course number. You did not enter a 6 digit int." );
            return;
        } //end of else statement
        
    } //end of method 
    
} //end of class