class Solution {
    private int Prod(int n){
        int prod=1;

        while(n>0){
            int rem=n%10;
            n/=10;
            prod*=rem;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        while(n>0){
        if(Prod(n)%t==0)return n;
        else{
            n++;
        }
        }
        return -1;
    }
}