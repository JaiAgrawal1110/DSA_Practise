package Arrays;

public class Single_in_double {
    class Solution {
    int single(int[] arr) {
        // code here
        int low=0;
        int high=arr.length-1;
        int mid=0;
        if(arr.length==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[arr.length-2]!=arr[arr.length-1]) return arr[arr.length-1];
        
        while(low<=high){
             mid= low + (high-low)/2;
            
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1])return arr[mid];
            
            int f=mid;int s=mid;
            if(arr[mid-1]==arr[mid]) f=mid-1;
            else s=mid+1;
            int leftCount=f-low;
            int rightCount=high-s;
            if(leftCount%2==0) low=s+1;
            else high=f-1;
        } return 65;
    }
}
    
}
