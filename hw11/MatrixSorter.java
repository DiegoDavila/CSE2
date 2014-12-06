//Diego Davila
//CSE2
//hw11-MatrixSorter

public class MatrixSorter{
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
              findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }//end of main methos
    
    public static int [][][] buildMat3d(){
        
        int [][][] array= new int [3][][];
        
        for(int s=0; s<3; s++){ //give number of rows for each of the 3 slabs s 
            array[s]=new int [3+2*s][];
            
            for(int j=0; j<array[s].length; j++){ //give number of columns in each row j in each slab s
                array[s][j]=new int [s+j+1];
            }
            
        }
        
        //loops to assign random values
        for (int s=0; s<array.length; s++){ //go to slab s
            
            for(int r=0; r<array[s].length; r++){ //go to each row r in slab s
                
                for(int c=0; c<array[s][r].length; c++){ //go to reach column in row r in slab s
                    
                    int n = (int)(Math.random()*99+1);
                    
                    array[s][r][c]=n;
                    
                }
                
            }
            
        }//end of for loops to assign random value
        
        
        return array;
        
    }//end of method buildMat3d
    
    public static void show(int [][][]array){
        
        String out = "-----------------------------Slab 1\n";
        
        for(int s=0; s<array.length; s++){
            
            if(s>0){
                out+="-----------------------------Slab " +(s+1)+"\n";
            }
            
            for(int r=0; r<array[s].length; r++){
            
                if(r>0){
                    out+="\n";
                }
            
                for(int c=0; c<array[s][r].length; c++){
                
                    if(c>0){
                    out+=" ";
                    }
            
                out+=array[s][r][c];
                
                }
        
            }
            
            out+="\n";
            
        }//end of for loops
        
        System.out.println(out);
        
    }//end of method show
    
    public static int findMin(int array [][][]){
        
        int min=array[0][0][0]; //get any value to be the minimum
        
        for (int s=0; s<array.length; s++){ //go to slab s
            
            for(int r=0; r<array[s].length; r++){ //go to each row r in slab s
                
                for(int c=0; c<array[s][r].length; c++){ //go to reach column in row r in slab s
                    
                    if(array[s][r][c]<min){
                        min=array[s][r][c];
                    }
                    
                }
                
            }
            
        }//end of for loops that check every value to find the minimum
        
        return min;
        
    }//end of method findMin
    
    public static int [][] sort(int array [][]){ //sort method //array[2]---7 rows
    
        /*example output:
            
            ---------------------------Slab 3
                    33 54 74
                    54 59 65 47  
                    42 41 98 31  5
                    13 90  6  1 29  3
                    39 40 58 62 33 23 14
                    32  4 12 72 11 27 95 78
                    39 16 84 66 20  9 34  2 62
                    
            ---------------------------Slab 3 sorted
                    1  3  6 13 29 90
                    2  9 16 20 34 39 62 66 84
                    4 11 12 27 32 72 78 95
                    5 31 41 42 98
                    14 23 33 39 40 58 62
                    33 54 74
                    47 54 59 65


        
        */
        
        
        for (int i=0; i<array.length; i++){
        
            
        
           for(int j=0; j<array[i].length; j++){ //go to each row 
                
                boolean mustSwap=false;
                int index=0;
                int min = array[i][j];
               for(int k=j; k<array[i].length; k++){ //go to reach num
                    
                    if(array[i][k]<min){
                        min=array[i][k];
                        index=k;
                        mustSwap=true;
                        
                    }
                    
                }
                
                if(mustSwap){
                    int large=array[i][j];
                    array[i][index]=large;
                    array[i][j]=min;
                }
            
            }//end of for loops that check every value to find the minimum
        
            
        }
        
        /*
        //for loop to access for all rows
        for(int i=0; i<array.length; i++){ //array.length=7 ROWS
            
            //for loop to access each row, to travel the length of the row
            for(int k=0; k<array[i].length-1; k++){ //Array[i].length= 3 for i=0, 4 for i=1, 5 for i=2
            
                //loop above must run twice so in case lowest value is at the end the maximum number of 
                //runs we need is two times the loop above (double loop for worst case scenario)
                for(int j=0; j<array[i].length-1; j++){
                
                    if(array[i][j]>array[i][j+1]){
                    
                        int greater=array[i][j];
                        int lesser=array[i][j+1];
                    
                        array[i][j]=lesser;
                        array[i][j+1]=greater;
                    }   
            
                }
            
            }
            
        }//end of loop to sort values inside each row 
        
        */ 
        
                            

        
        for(int i=0; i<array.length-1; i++){ //insertion sort for rows
            
        	for(int j=0; j<array.length-1; j++){
                
                if(array[j][0]>array[j+1][0]){
                    
                    int [] greater=new int [array[j].length];
                    int [] lesser=new int [array[j+1].length];
                    
                    for(int z=0; z<greater.length; z++){
                        greater[z]=array[j][z];
                    }
                    
                    for(int z=0; z<lesser.length; z++){
                        lesser[z]=array[j+1][z];
                    }
                    
                    array[j]=lesser;
                    array[j+1]=greater;
                }   
            
            }
            
        
        }//end of all loops to sort each row        
         
        return array;
    }//end of method to sort 
    
    
 
    
    
}//end of class
