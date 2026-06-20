class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int rows=mat.length;int cols=mat[0].length;
        int low=0;
        int high=rows*cols-1;
        while(low<=high){
            int mid= (low+high)/2;
            int midRow=mid/cols;int midcols=mid%cols;
            if(mat[midRow][midcols]==x)return true;
            else if(mat[midRow][midcols]>x)high=mid-1;
            else if(mat[midRow][midcols]<x)low=mid+1;;


        }return false;
    }
}
