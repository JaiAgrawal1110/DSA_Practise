
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num :a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int ele: b){
            if(!map.containsKey(ele) || map.get(ele)==0)return false;
            
            map.put(ele,map.get(ele)-1);
        }
        
        return true;
        
    }
}
