class Solution {
    public int majorityElement(int[] nums) {
     int n = nums.length;
    //  for(int i=0;i<n;i++){
    //     int count =1;
    //     for(int j=0;j<n;j++){
    //         if( j!=i && nums[i]==nums[j]){
    //              count++;
    //         }
    //     }
    //     if(count>n/2){
    //       return  nums[i];
    //     }
    //  }  
      int index=0;
      int count =1;
      for(int i=1;i<n;i++){
        if(nums[i]==nums[index]){
          count++;
        }
        else{
          count--;
        }
        if(count==0){
          index=i;
          count=1;
        }
      }











     return -1; 
    }
}