class Solution {
    public int countValidSelections(int[] nums) {
        int left=0;
        int right=0;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            right=total-left-nums[i];
            if(nums[i]==0){
            if(left==right){
                ans+=2;
            }
            if(Math.abs(left-right)==1){
                ans+=1;
            }
            }
            left+=nums[i];
        }
        return ans;
    }
}