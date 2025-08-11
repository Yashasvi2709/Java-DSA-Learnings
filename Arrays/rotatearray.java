class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
       int temp[] = new int[k];
       int count =0;
       for(int i=nums.length-k;i<nums.length;i++){
              temp[count]=nums[i];
              count++;
       } 
       for(int i=nums.length-1-k;i>=0;i--){
        nums[i+k]=nums[i];
       }
       for(int i=0;i<k;i++){
        nums[i]=temp[i];
       }
    }
}