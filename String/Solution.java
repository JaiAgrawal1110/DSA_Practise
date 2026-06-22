package String;

public class Solution {
    boolean isPalindrome(String s) {
        // code here
        for(int i =0;i<s.length()/2;i++){
            char c=s.charAt(i);
            char n=s.charAt(s.length()-i-1);
            if(c!=n) return false;
            
        }
        return true;
    }
} 
