class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;

        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int curr=0;
            int days_needed=1;

            for(int weight:weights){
                if((curr+weight) >mid){
                    days_needed++;
                    curr=0;
                }
                curr+=weight;
            }
                if(days_needed<=days){
                    right=mid;
                }else{
                    left=mid+1;
                }
                
            }
             return left;
        }
       
    }
