class Solution {
    public int[] applyOperations(int[] nums) {
        int j=0;
        int n=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[j]==nums[i]){
                nums[j]*=2;
                nums[i]=0;
                j++;
            }else{
                j++;
            }
        }
          j=0;
          for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(j<n){
            nums[j++]=0;
        }
        return nums;


    }
}