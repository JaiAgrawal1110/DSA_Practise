class Solution {
    private boolean div(int n){
       // if(n==0)return true;
        int k=n;
        boolean t=true;
        while(n>0){
            int rem=n%10;
            if(rem==0)return false;
            if(k%rem!=0)return false;
            n/=10;
        }
        return t;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List <Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(div(i)==true){
                ans.add(i);
            }
        }
        return ans;
    }
}