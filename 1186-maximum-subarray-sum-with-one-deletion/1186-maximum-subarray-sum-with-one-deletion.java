class Solution {
    public int maximumSum(int[] arr) {
        
        int onedelete=0;
        int nodelete=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            int prev_no=nodelete;
            nodelete=Math.max(nodelete+arr[i],arr[i]);
            onedelete=Math.max(prev_no,onedelete+arr[i]);
            max=Math.max(max,Math.max(onedelete,nodelete));
        }
        return max;
    }
}