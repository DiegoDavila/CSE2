//Diego Davila
//CSE2
//lab12 - Array Arithmetic

public class ArrayMath{
    public static void main(String [] arg){
        double x[]={2.3, 3, 4, -2.1, 82, 23},
        y[]={2.3, 3, 4, -2.1, 82, 23},
        z[]={2.3, 13, 14},
        w[]={2.3, 13, 14, 12}, 
        v[],
        u[]={2.3, 12, 14};
        v=addArrays(x,y);
        System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
        System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
            +display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y)+" that "+display(x)+
            " == "+display(y));
        System.out.println("It is " + equals(z,w)+" that "+display(z)+
            " == "+display(w));
        System.out.println("It is " + equals(u,z)+" that "+display(u)+
            " == "+display(z));

  }
  
    public static String display(double [] x){
        String out="{";
        for(int j=0;j<x.length;j++){
            if(j>0){
                out+=", ";
            }
        out+=x[j];
        }
        return out+"}";
    }//end of method display
    
    public static boolean equals(double[] array1, double[] array2){
        boolean result=true;
        
        if (array1.length!=array2.length){
            result=false;
        }//end of if 
        else{
            
            for(int i=0; i<array1.length; i++){
                
                if(array1[i]==array2[i]){
                    result=true;
                    continue;
                }
                else{
                    result=false;
                    break;
                }
                
            }
        
        }//end of else
        
        return result;
        
    }//end of method equals()
    
    public static double [] addArrays(double[] array1, double[] array2){
        
        int sumLength=0;
        
        if (array1.length>=array2.length){
            sumLength=array1.length;
        }
        else{
            sumLength=array2.length;
        }
        
        double [] sum = new double[sumLength];
        
        if(array1.length>array2.length){
            
            for (int i=0; i<array2.length; i++){
            
                sum[i]=array1[i] + array2[i];
            
            }
            for (int j=array1.length-array2.length; j<array1.length; j++){
                sum[j]=array1[j];
            }
            
        }//end of if array 1 is greater than array2
        
        else if(array1.length>array2.length){
            
            for (int i=0; i<array1.length; i++){
            
                sum[i]=array2[i] + array1[i];
            
            }
            for (int j=array2.length-array1.length; j<array2.length; j++){
                sum[j]=array2[j];
            }
            
        }//end of if array2 is greater than array1
        
        else{
        
            for (int i=0; i<array1.length; i++){
            
                sum[i]=array1[i] + array2[i];
            
            }
            
        }
        
        
        return sum;
        
    }//end of method addArrays
  
  
  
}//end of class
