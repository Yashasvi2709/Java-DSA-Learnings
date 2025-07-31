public static void multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
    if(c1!=r2){
        return null;
    }
    int [][] mul = new int[r1][c2];
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            for(int k=0;k<c1;k++){
             mul[i][j]=a[i][k]*b[k][j];   
            }
            
            
        }
    }
    
    
    
}