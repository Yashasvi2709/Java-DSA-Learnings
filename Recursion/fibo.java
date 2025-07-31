import java.util.Scanner;
public class Main
{
    public static int fibonacci(int n){
        if(n==0 || n==1){
           return n;
        }
        int prev1 = fibonacci(n-1);
        int prev2 = fibonacci(n-2);

       return prev1+prev2;
    }
    public static void main(String [] args){
        System.out.print(fibonacci(4));
    }
}