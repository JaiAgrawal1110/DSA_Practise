class Solution {
     public static int maxRect(int []arr){
        Stack <Integer> st=new Stack<>();
        int []nse= new int[arr.length];
        int n=arr.length;
        nse[n-1]=n;
        st.push(n-1);
        
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i])st.pop();
            if(st.size()==0)nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }while(st.size()>0)        st.pop();
        int [] pse=new int[n];
        pse[0]=-1;
        st.push(0);
         for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]>=arr[i])st.pop();
            if(st.size()==0)pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            int area=arr[i]*(nse[i]-pse[i]-1);
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
        
    }
    public int maximalRectangle(char[][] matrix) {

        int n=matrix.length;
        int m= matrix[0].length;
        int [] height=new int[m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }else height[j]=0;
            }
            ans=Math.max(ans,maxRect(height));

        }
        return ans;
        
    }
}