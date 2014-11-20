//Diego Davila
//CSE2
//lab13-Arrays


public class lab13Arrays{
    
    public static void main(String [] args){
        
        int [][] array = new int [5][];
        
        for (int j=0; j<5; j++){ 
            
            array[j]=new int [j*3+5];
            
        }
        
        for (int i=0; i<array.length; i++){
            
            for(int j=0; j<array[i].length; j++){
            
                int n=(int)(Math.random()*40);
                
                array[i][j]=n;
                
            }
            
        }
        
        System.out.println("The array before sorting:\n" +display(array));
        
        for(int i=0; i<array.length; i++){
            
            for(int k=0; k<array[i].length-1; k++){
            
                for(int j=0; j<array[i].length-1; j++){
                
                    if(array[i][j]>array[i][j+1]){
                    
                        int greater=array[i][j];
                        int lesser=array[i][j+1];
                    
                        array[i][j]=lesser;
                        array[i][j+1]=greater;
                    }   
            
                }
            
            }
            
        }
        
        System.out.println("\nThe array after sorting:\n" +display(array));
        
        
    }//end of main method
    
    
    public static String display(int [][] x){
        
        String out="";
        
        for(int i=0; i<x.length; i++){
            
            if(i>0){
                out+="\n";
            }
            
            for(int j=0; j<x[i].length; j++){
                
                if(j>0){
                    out+=" ";
                }
            
                out+=x[i][j];
                
            }
        
        }
        
        return out;
        
    }//end of method display
    
}//end of class