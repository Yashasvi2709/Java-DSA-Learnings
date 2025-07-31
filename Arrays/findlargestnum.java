import java.util.*;
public class Main{
    public static int largestofall(int [] arr){
        int max =arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int[] takeinput(){
         Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }


	public static void main(String[] args) {
	    int arr[] = takeinput();
	    int largestnumber = largestofall(arr);
	    System.out.println(largestnumber);
	   
// 		System.out.println("Hello World");
	}
}