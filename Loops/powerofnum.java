
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
       int x = s.nextInt();
	   int n = s.nextInt();
	   int result  =1;
	   int i = 1;
	   while(i<=n){
	       result*=x;
	       i++;
	   }
		System.out.println(result);
	}
}
//using function 
import java.util.*;
public class Main
{
    public static int pow(int a, int b){
        int ans =1;
        for(int i=1;i<=b;i++){
            
            ans*=a;
        }
        return ans;
	    
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
		int expo = pow(a,b);
		System.out.println(expo);
	}
}