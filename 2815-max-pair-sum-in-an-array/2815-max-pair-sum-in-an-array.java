class Solution {
    private int maxDigit(int nums){
        int max=0;
        while(nums>0){
            max=Math.max(max,nums%10);
            nums/=10;
        }
        return max;
    }
    public int maxSum(int[] nums) {
            int ans=-1;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(maxDigit(nums[i])==maxDigit(nums[j])){
                        ans=Math.max(ans,nums[i]+nums[j]);
                    }
            }
        }
        return ans;
    }
}