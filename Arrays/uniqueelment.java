
import java.util.*;
public class Main{
    


	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	  int si = 0;
	  int ei = arr.length-1;
	  int count=0;
	  if(arr[si]==arr[ei]){
	      count++;
	      
	  }
	  ei--;
	  si++;
	  if(count==0){
	      System.out.println( "NUMBER WHICH IS UNIQUE IS " + arr[si]);
	  }
	    
	    
	    
	   // System.out.println(ispresent);
	    
	    

	}
// public static int linearsearch(int [] arr,int x){
    
//       for(int i=0;i<arr.length;i++){
//           if(arr[i]==x){
//               return i;
//           }
//       }
//       return -1;
// }
}














// 		System.out.println("Hello World");