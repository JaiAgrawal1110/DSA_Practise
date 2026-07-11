class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }else{
                map.put(arr[i],1);
            }
        }
        HashSet<Integer> seen=new HashSet<>();
        for(int ele:map.values()){
            if(seen.contains(ele))return false;
            else seen.add(ele);
        }
        return true;

        
    }
}