
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int count = 0;
       while(n>0){
           n = n/10;
           count++;
       }
        System.out.println(count);

	}
}
// using function:- 
import java.util.*;
public class Main
{
    public static int count(int n){
      int count =0;
	    while(n>0){
	        n =n/10;
	        count++;
	    }  
	    return count;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
		int totalcount = count(n);
		System.out.println(totalcount);
	}
}