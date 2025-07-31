import java.util.Scanner;
public class ReverseofNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r  = 0;
        while(n>0){
        int p = n%10;
         r = r*10+p;
         n = n/10;

        }
        System.out.println(r);
    }
}
//using function 
import java.util.*;
public class Main
{
    public static int reverseofdigit(int n){
      int rev =0;
	   while(n>0){
	       int rem = n%10;
	       rev = rev*10 + rem;
	       n=n/10;
	   } 
	    return rev;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
		int reverse = reverseofdigit(n);
		System.out.println(reverse);
	}
}