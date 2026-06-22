package String;

class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase().replaceAll("[^a-z0-9]","");

        for(int i =0;i<s.length()/2;i++){
            char a=s.charAt(i);
            char n= s.charAt(s.length()-i-1);
            if(a!=n) return false;
        }
        return true;
        
    }
}