class Solution {
    private int digits(int n){
        int min=9;
        int max=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            max=Math.max(max,rem);
            min=Math.min(min,rem);
        }
        return max-min;
    }
    public int maxDigitRange(int[] nums) {
        int max=0;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,digits(nums[i]));
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(digits(nums[i])==max){
                sum+=nums[i];
            }
        }
        return sum;
    }
}