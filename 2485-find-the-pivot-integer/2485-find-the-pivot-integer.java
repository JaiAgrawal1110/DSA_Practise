class Solution {
    public int pivotInteger(int n) {
        
        int left=1;
        int right=n;
        int j=n;
        int i=1;
        while(i<j){
             
            if(left<right){
                i++;
                left+=i;
            }
            else{
                 j--;
                right+=j;
        }
        }

        if(left==right)return i;
        return -1;
    }
}