class Solution {
    public static String reverseString(String s) {
        // code here
        int n= s.length();
        char [] arr=s.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return new String(arr);
    }
}