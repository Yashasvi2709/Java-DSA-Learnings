
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
       int n = s.nextInt();
      int p = 1;
      boolean isprime = true;
	  for(int i=2;i<n-1;i++){
	      if(n%i==0){
	        System.out.println(i);  
            isprime = false;
	      }
	      
	  }
	  if(p==0){
		System.out.println("PRIME");
	  }else{
	      System.out.println(" NOT PRIME");
	  }
	}
}