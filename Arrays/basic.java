import java.util.*;
public class Main
public static void printArray(int [] arr){
    int n = arr.length;
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
  public static int[] takeinput(){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
  }

	public static void main(String[] args) {
	    
	    int [] arr = takeinput();
	    printArray(arr);
// 		System.out.println("Hello World");
	}
}