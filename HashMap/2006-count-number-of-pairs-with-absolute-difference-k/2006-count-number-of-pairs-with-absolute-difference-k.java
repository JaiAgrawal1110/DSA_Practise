class Solution {
    public int countKDifference(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int num:nums){
            count+=map.getOrDefault(k+num,0);
        }
        return count;
    }
}