public static int count(int n){
    
    if(n >= 0 && n <= 9){ 
        return 1;
    }
   
    else{
    int  p= count(n/10)+1;
     return p;
       
    }
      
}