class Solution {
    
    public int largestInteger(int n, int s) {
       
        int ans=0;
        int max=0;
        if(s>9*n)return -1;
        for(int i=0;i<n;i++){
            max=Math.min(9,s);
            ans=ans*10+max;
            s=s-max;
        }
        return ans;
    }
}