public static int [][] transpose(int[][] a,int r ,int c){
    if(r1!=c){
        return null;
    }
    for(int i=0;i<c;i++){
        for(int j=i;j<r;j++){
            int temp = arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    
    
    
}