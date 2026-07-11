class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> ele=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            ele.add(nums[i]);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!ele.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}