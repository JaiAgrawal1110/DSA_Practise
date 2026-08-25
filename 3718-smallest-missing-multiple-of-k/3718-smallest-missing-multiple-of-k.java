class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=1;
        while(i>0){
            if(!set.contains(i*k)){
                return i*k;
            }else{
                i++;
            }
        }
        return i+k;
    }
}