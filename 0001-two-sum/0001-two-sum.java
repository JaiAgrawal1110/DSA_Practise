class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> key=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(key.containsKey(target-nums[i])){
                return new int [] {key.get(target-nums[i]),i};
            }else             key.put(nums[i],i);
        }
        
        return null;
    }
}