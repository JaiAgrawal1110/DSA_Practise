class Solution {
    private int count(int n){
        int count=0;
        while(n>0){
            int rem=n%10;
            count++;
            n/=10;

        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(count(nums[i])%2==0){
                p++;
            }
        }
        return p;
    }
}