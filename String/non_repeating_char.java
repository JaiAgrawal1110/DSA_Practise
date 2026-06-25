package String;

public class non_repeating_char {
class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        
        //int minCount=10;
        int i=0;
        int [] freq=new int [26];
        for( i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        //char ans=s.charAt(0);
        for( i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
}

