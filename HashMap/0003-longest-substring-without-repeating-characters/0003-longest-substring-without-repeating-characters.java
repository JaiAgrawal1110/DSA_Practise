class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int len=0;
        int max=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }else{
                len=j-i;
                max=Math.max(len,max);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }set.remove(s.charAt(i));
                i++;
            }
        }
        len=j-i;
                max=Math.max(len,max);
                return max;
        
    }
}