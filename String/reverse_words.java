package String;

class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder sb= new StringBuilder();
        boolean first=true;
        String[] words=s.split("\\.");
        for(int i=words.length-1;i>=0;i--){
            if(words[i].isEmpty())continue;
            if(!first){
                sb.append(".");
            }
            sb.append(words[i]);
            first=false;
            
        }
        return sb.toString();
    }
}
