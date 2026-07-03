class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        if(s1.length()==0 || s2.length()==0)return "0";

        boolean negative =  (s1.charAt(0) == '-') ^(s2.charAt(0) == '-');
        
        if (s1.charAt(0) == '-')
         s1 = s1.substring(1);

        if (s2.charAt(0) == '-')
         s2 = s2.substring(1);
         while (s1.length() > 1 && s1.charAt(0) == '0')
            s1 = s1.substring(1);

        while (s2.length() > 1 && s2.charAt(0) == '0')
            s2 = s2.substring(1);

        if (s1.equals("0") || s2.equals("0"))
            return "0";
        StringBuilder sb=new StringBuilder();
        int m=s1.length();
        int n=s2.length();
        int [] ans=new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mul=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
                int p1=i+j;
                int p2=i+j+1;
                
                int total=mul+ans[p2];
                ans[p2]=total%10;
                ans[p1]+=total/10;
                
            }
        }
        for(int i=0;i<ans.length;i++){
            if(sb.length()==0 && ans[i]==0)continue;
            sb.append(ans[i]);
        }
        if (negative && !sb.toString().equals("0"))
             sb.insert(0, '-');
        return sb.toString();
    }
}