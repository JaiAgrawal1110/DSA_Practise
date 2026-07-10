package Queue;

class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue <Integer> q2=new LinkedList<>();
        
        int n=q.size();
        for(int i=0;i<n/2;i++){
            q2.add(q.remove());
        }
        for(int i=0;i<n/2;i++){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}
