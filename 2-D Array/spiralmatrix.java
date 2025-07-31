public static void spiral(int [][]arr){
    int rowbegin= 0;
    int colbegin =0;
    int colend = arr[0].length-1;
    int rowend = arr.length-1;

    while(rowbegin<=rowend  &&  colbegin<=colend){
        for(int i=colbegin;i<=colend;i++){
            System.out.print(arr[rowbegin][i]);
            rowbegin++;
        }
        for(int i=rowbegin;i<=rowend;i++){
            System.out.print(arr[i][colend]);
            colend--;
        }
        for(int i=colend;i>=colbegin;i--){
            System.out.print(arr[rowend][i]);
            rowend--;
        }
        for(int i=rowend;i>=rowbegin;i--){
            System.out.print(arr[i][colstart]);
            colbegin++;
        }

    }
}