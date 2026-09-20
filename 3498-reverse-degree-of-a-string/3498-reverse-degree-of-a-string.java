class Solution {
    public int reverseDegree(String s) {
        char[]c=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
            int b='z'-c[i]+1;
            sum+=b*(i+1);
        }
        return sum;
    }
}