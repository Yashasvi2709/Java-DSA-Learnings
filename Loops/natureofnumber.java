import java.util.Scanner; 
public class NatureOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Your no. is positive");
        }
        else{
            System.out.println("Your no. is negative");
        }
    }
}