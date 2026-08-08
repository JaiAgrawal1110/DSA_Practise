class Solution {
    private List<Integer> digits(int n){
        List<Integer>ans=new ArrayList<>();
        while(n>0){
            int rem=n%10;
            n/=10;
            ans.add(rem);
        }
        Collections.reverse(ans);
        return ans;
    }
    public int[] separateDigits(int[] nums) {
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            ans.addAll(digits(nums[i]));
        }
        int []result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    
        
    }
}