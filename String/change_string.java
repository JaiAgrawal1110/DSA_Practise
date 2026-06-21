package String;

class Solution {
    String modify(String s) {
        
        int a= (int)s.charAt(0);
        if(a>=65 && a<=90){
            return s.toUpperCase();
            
        }
        else if(a>=97&&a<=122){
            return s.toLowerCase();
        }
        return s;
    }
}

