class Solution {
    public long sqrt(long n){
        if(n==0) return 0;
        long low=0;
        long high=n;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid==n/mid) return mid;
            else if(mid<n/mid) low=mid+1;
            else high=mid-1;
        }
        return high;

    }
    public int arrangeCoins(int n) {
        long x=(sqrt(8L*n+1)-1);
        int k=(int) x/2;
        return k;
    }
}