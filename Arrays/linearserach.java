
import java.util.*;
public class Main{
// public static void linearsearch(int [] arr,int x){
    
// } 
public static int[] takeinput(){
    Scanner sc = new Scanner(System.in);
      System.out.println("HOW MANY ELEMENTS?");
    int  n = sc.nextInt();
    int arr[] = new int [n];
    for(int i=0;i<n;i++){
          System.out.println("ENTER VALUE AT " + i + "th POSITION");
        arr[i]=sc.nextInt();
    }
    return arr;
}
public static boolean isfound(int arr[],int x){
    int n = arr.length;
       for(int i=0;i<n;i++){
           if(arr[i]==x){
             return  true;
                
           }
       }
       return false;
}

	public static void main(String[] args) {
	     System.out.println("TAKING INPUT");
	    int [] arr = takeinput();
	    Scanner sc = new Scanner(System.in);
	      System.out.println("VALUE TO SEARCH FOR:-");
	    int x = sc.nextInt();
	    boolean ispresent = isfound(arr,x);
	    
	    
	    
	    
	    
	    
	    System.out.println(ispresent);
	    
	    

	}
}