class Solution {
    private int sum(int n){
        int sum=0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        return (sum+prod);
    }
    public boolean checkDivisibility(int n) {
        if(n%(sum(n))==0)return true;
        return false;
    }
}