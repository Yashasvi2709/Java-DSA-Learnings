public class Main
{
	public static void main(String[] args) {
	    int [] arr = {0,1,0,1,0,1};
	    int n = arr.length;
	    int zero =0 ;
	    int one =0;
	    for(int i=0;i<n;i++){
	        if(arr[i]==0){
	            zero++;
	        }
	        else{
	            one++;
	        }
	    }
	   
	    for(int i=0;i<zero;i++){
	        arr[i]=0;
	        
	    }
	   
	    for(int i=zero;i<n;i++){
	        arr[i]=1;
	        
	    }
	    for(int i=0;i<n;i++){
	      System.out.println(arr[i]);  
	    }
// 		System.out.println("Hello World");
	}
}