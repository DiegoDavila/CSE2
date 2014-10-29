public String ascending(int x, int y, int z){
        int smallest;
        int middle; 
        int smallest
        if (x<y && x<z){
            smallest=x;
            if (y<z){
                middle=y;
                largest=z;
            }
            else if (z<y){
                middle=z;
                largest=y;
            }
        }
        else if (y<x && y<z) {
            smallest=y;
            if (x<z){
                middle=x;
                largest=z;
            }
            else if (z<x){
                middle=z;
                largest=x;
            }
        }
        else if (z<x && z<y){
            smallest=z;
              if (y<x){
                middle=y;
                largest=x;
            }
            else if (y<x){
                middle=y;
                largest=z;
            }
        }
}