public static void rotate90(int [][]arr ,int n){
   for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
   }
   for(int i=0;i<n;i++){
    int s=0;
    int e= arr.length-1;
    while(s<e){
        int temp=arr[i][s];
        arr[i][s]=arr[i][e];
        arr[i][e]=temp;
    }
   }
}