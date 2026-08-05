class Solution {
    public int[] numberOfPairs(int[] nums) {

        int pair=0;
        int single=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num:map.values()){
             pair+=num/2;
             single+=num%2;
            }
        return new  int [] {pair,single};
        
    }
}