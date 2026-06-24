class Solution {
    public char getMaxOccuringChar(String s) {
        // code here

        // BRUTE FORCE APPROACH
        int maxCount=1;
        int count=1;
        int index=0;
        int i=0;
        char [] arr=s.toCharArray();
        Arrays.sort(arr);
        
        for( i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) {
                count++;
                if(maxCount<count){
                    maxCount=count;
                    index=i;
                }//else break;
            }else count=1;
                
        }return arr[index];
            
        } 
        
    }
// Optimal approach !!!time complex->o(n) and space complex->o(1)

    class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        int [] freq=new int [26];
        int maxCount=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        char ans= s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxCount){
                maxCount=freq[i];
                ans=(char)(i+'a');
            }
        }
        return ans;
            
        } 
        
    }

