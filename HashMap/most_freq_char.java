class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                    map.put(s.charAt(i),1);
                }
        }
        int max = 0;
        char ans = '{';   

        for (char ch : map.keySet()) {
            int freq = map.get(ch);

            if (freq > max) {
                max = freq;
                ans = ch;
            } else if (freq == max && ch < ans) {
                ans = ch;
            }
        }
        return ans;
    }
}