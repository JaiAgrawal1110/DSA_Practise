class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int place=1;
        int ans=0;
        for(int i=0;i<4;i++){
            int digit=Math.min(Math.min((num1/place)%10,(num2/place)%10),(num3/place)%10);
            ans+=digit*place;
            place*=10;
        }
        return ans;
    }
}