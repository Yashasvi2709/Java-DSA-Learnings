public static int [][] sum(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
    if(r1!=r2 || c1!=c2){
        return null;
    }
     int sum [][] = new int[r1][c1];
     for(int i=0;i<r1;i++){
         for(int j=0;j<c1;j++){
             sum[i][j]=a[i][j]+b[i][j];
         }
     }
     return sum;
    
    
    
}