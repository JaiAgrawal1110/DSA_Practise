class Solution {
    public int countCommas(int n) {
        long ans=0;
        long start=1000;
        int commas=1;

        while(start<=n){
            ans+=(long)(n-start+1)*commas;
            start*=1000;
            commas++;
        }
        return (int)ans;
    }
}