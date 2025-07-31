import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r  = 0;
       for(int i =n;i>=1;i--){
           r = r*10 +i;
           
       }
       System.out.println(r);
    }
}