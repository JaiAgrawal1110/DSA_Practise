class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int n=s.length();

        for(int i=1;i<n;i++){
            sum+=Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return sum;
        
    }
}