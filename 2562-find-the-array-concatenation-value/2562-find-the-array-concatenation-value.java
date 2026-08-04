class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length/2;i++){
            int a=nums[i];
            int b=nums[n-i-1];
            sum+=Integer.parseInt("" + a + b);
        }
        if(n%2==1){
            sum+=nums[n/2];
        }
        return sum;
    }
}