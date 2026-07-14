class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap <String,List<String>> map=new HashMap<>();

        for(String ch:strs){
            char [] arr=ch.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(ch);
        }
        return new ArrayList<>(map.values());
    }
}