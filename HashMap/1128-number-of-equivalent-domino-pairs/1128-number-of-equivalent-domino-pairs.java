class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] freq = new int[10][10];
        int ans = 0;

        for(int [] d:dominoes){
            int a= Math.min(d[0],d[1]);
            int b= Math.max(d[0],d[1]);

            int key =a*10+b;

            ans+=freq[a][b];
            freq[a][b]++;
        }

        return ans;
    }
}