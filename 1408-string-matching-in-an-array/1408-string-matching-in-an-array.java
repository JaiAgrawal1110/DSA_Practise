class Solution {
    public List<String> stringMatching(String[] words) {
        List <String> ans=new ArrayList<>();
        for(String word:words){
            for(String other:words){
                if(!word.equals(other)&&other.contains(word)){
                    ans.add(word);
                    break;
                }
            }
        }
        return ans;
    }
}