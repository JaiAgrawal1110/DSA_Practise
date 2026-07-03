class Solution {
    public boolean isPalindrome(int x) {
                int temp=x;

        if(temp<0){
            return false;
        }
        int rev=0;
        int n=0;

        while(x>0){
            n=x%10;
            rev=rev*10+n;
            x=x/10;
            }
        
        
  return rev==temp;  }
}