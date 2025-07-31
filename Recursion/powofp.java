public static int pow(int p,int q){
    
    if(q==1){
        return p;
    }
   
    else{
   return pow(p,q-1)*p;
       
    }
      
}