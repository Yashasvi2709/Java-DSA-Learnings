public static int sum1ton(int n){
	    if(n>=0 && n<=9){
	        return n;
	    }
	   int sum = sum1ton(n/10)+n%10;
       return sum; 
	}