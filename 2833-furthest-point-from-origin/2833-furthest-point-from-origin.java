class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int blank=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L')left++;
            if(ch=='R')right++;
            if(ch=='_') blank++;
        }
        return Math.abs(right-left)+blank;
    }
}