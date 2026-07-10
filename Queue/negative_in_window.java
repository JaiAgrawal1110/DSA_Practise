package Queue;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        Queue <Integer> q= new LinkedList<>();
        ArrayList <Integer> ans= new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
           if(arr[i]<0)q.add(i);
        }
        
        for(int i=0;i<n-k+1;i++){
            while(!q.isEmpty() && q.peek()<i){
                q.remove();
            }
            if(!q.isEmpty() && q.peek()<=i+k-1){
                ans.add(arr[q.peek()]);
            }else ans.add(0);
        }
        return ans;
    }
}