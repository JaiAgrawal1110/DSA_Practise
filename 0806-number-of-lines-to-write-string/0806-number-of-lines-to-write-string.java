class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines=1;
        int width=0;

        for(char ch:s.toCharArray()){
            int curr=widths[ch-'a'];
            if(width+curr>100){
                lines++;
                width=curr;
            }else{
                width+=curr;
            }
        }
        return new int []{lines,width};
    }
}