import java.util.*;
public class Main{
    


	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    int index=0;
	    for(int i=1;i<=n;i+=2){
	      arr[index]=i;  
	      ++index;
	    }
	    int index1 = arr.length-1;
	    for(int i=2;i<=n;i+=2){
	        arr[index1]=i;
	        --index1;
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i] + " ");
	    }
	    
	    
	    
	    
	    
	   // System.out.println(ispresent);
	    
	    

	}
}