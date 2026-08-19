class Solution {
    public String reverseWords(String s) {
        String [] words= s.trim().split("\\s+");
        StringBuilder str=new StringBuilder();
        str.append("");
        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]);
            if(i!=0){
                str.append(" ");
            }
        }
        str.append("");
        return str.toString();
    }
}