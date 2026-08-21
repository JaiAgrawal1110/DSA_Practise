class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)return -1;

        int left=1;
        int right=0;
        for(int bloom:bloomDay){
            right=Math.max(bloom,right);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            int flowers=0;
            int bouquet=0;
            
            for(int bloom:bloomDay){
                if(bloom<=mid){
                    flowers++;
                
                if(flowers==k){
                    bouquet++;
                    flowers=0;
                }}else{
                    flowers=0;
                }
            }
            if(bouquet>=m){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}