class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0;
        if(n<0)return false;
        for(int i=0;i<32;i++){
            if((n&1)==1){
                count++;
                }
             n>>=1;
            if(count>1)return false;
        }
       
        return count==1; 
    }
}