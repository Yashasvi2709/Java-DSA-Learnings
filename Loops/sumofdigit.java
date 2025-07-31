
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int rev = 0;
       while(n>0){
         int  p = n%10;
           rev += p;
           n = n/10;
          
       }
        System.out.println(rev);

	}
}
// using function
import java.util.*;
public class Main
{
    public static int sumofdigits(int n){
      int sum =0;
	   while(n>0){
	       int ld = n%10;
	       sum = sum + ld;
	       n=n/10;
	   } 
	    return sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
		int totalsum = sumofdigits(n);
		System.out.println(totalsum);
	}
}