import java.util.*;
public class Main
{
    public static int dec(int a){
        int deci = 0;
        int powof2 =1;
        
       while(a>0){
           int ld = a%10;
           deci = deci +ld*powof2;
           a=a/10;
           powof2*=2;
       }
       return deci;
	    
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    
	    
		int decimal = dec(a);
		System.out.println(decimal);
	}
}