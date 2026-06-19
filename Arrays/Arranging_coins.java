// 441. Arranging Coins
// You have n coins and you want to build a staircase with 
// these coins. The staircase consists of k rows where the ith row has 
// exactly i coins. 
// The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of 
// the staircase you will build.
// The key note here was to make another function sqrt to find 
// the square root of a number 
// using binary search. The formula for finding the number of 
// complete rows is derived from the sum of the first k natural 
// numbers, which is given by k*(k+1)/2. By rearranging this 
// formula, we can derive that k must satisfy the inequality 
// k*(k+1)/2 <= n, which can be transformed into a quadratic
//  equation. Solving this equation gives us the formula for k,
//  which is (sqrt(8*n + 1) - 1) / 2.e 
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