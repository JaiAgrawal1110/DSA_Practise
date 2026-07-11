class Solution {
    private int square(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
             sum+=dig*dig;
             n=n/10;
        }
        return sum;
        
    }
    public boolean isHappy(int n) {

        HashSet <Integer> seen=new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=square(n);
        }
        return n==1;
        
    }
}