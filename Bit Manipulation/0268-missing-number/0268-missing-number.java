class Solution {
    public int missingNumber(int[] nums) {
        
        HashSet <Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans=0;
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                ans=i;
            }
        }
        return ans;
    }
}