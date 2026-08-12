class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int CurrentSum=nums[0];
        int CurrentSum2=nums[0];
        int MaxSum=nums[0];
        int MinSum=nums[0];
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            CurrentSum=Math.max(nums[i],CurrentSum+nums[i]);
            MaxSum=Math.max(CurrentSum,MaxSum);
            CurrentSum2=Math.min(nums[i],CurrentSum2+nums[i]);
            MinSum=Math.min(CurrentSum2,MinSum);
        }
        max=Math.max(MaxSum,Math.abs(MinSum));
        return Math.abs(max);

        
    }
}