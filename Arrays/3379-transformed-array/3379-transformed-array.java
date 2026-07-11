class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int [] result= new int[nums.length];
        int n=nums.length;
            for (int i = 0; i < n; i++) {
            int newIndex = ((i + nums[i]) % n + n) % n;
            result[i] = nums[newIndex];
        }
        return result;
    }
}