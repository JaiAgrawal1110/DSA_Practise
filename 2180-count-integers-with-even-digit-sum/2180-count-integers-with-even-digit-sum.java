class Solution {
    private int digit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            sum+=rem;
        }
        return sum;
    }
    public int countEven(int num) {
        int count=0;

        for(int i=1;i<=num;i++){
            if(digit(i)%2==0){
                count++;
            }
            
        }
        return count;

        
    }
}