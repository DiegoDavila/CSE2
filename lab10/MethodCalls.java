//Diego Davila
//CSE2
//lab10-MethodCalls



public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/

    public static int addDigit (int number, int digit){
        
        if (digit<0 || digit>9){ //if DIGIT is not between 0 and 9 just resturn the number
            return number;
        }
        
        if (number<0){
            number*=-1;
            int result = addDigit(number,digit)*-1; //convert the added strings to an int
		    return result; //return the int
        }
    
        String numString = "" + number; //convert number to a string
        String digString = "" + digit; //convert digit to a string
        String resultString = digString + numString; //add the strings
        
        int result = Integer.parseInt(resultString); //convert the added strings to an int
		
		return result; //return the int
		        
    }//end of method addDigit
  

    public static int join(int number1, int number2) { //start of method join
        
        int checkSigns=1; //used to give proper negative or positive depending on input 
        
        if (number1<0 && number2<0){ //if both inputs are negative turn them positive and result is positive
        	number1*=-1;
        	number2*=-1;
        	checkSigns=1;
        }
        else if (number1<0 && number2>0){ //if only number 1 is negative turn it positive and result is negative
        	number1*=-1;
        	checkSigns=-1;
        }
        
    
        String num1String= "" + number1;
        for (int k=1; k<=num1String.length(); k++){
            int digit = (int) (number1%10);
            number2=addDigit(number2, digit);
            number1=(int) (number1/10);
        }

        return number2*checkSigns;
        
    }//end of method join


}//end of class
