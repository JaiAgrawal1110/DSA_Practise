class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int []arr=new int[capacity.length];
        int extra=additionalRocks;
        for(int i=0;i<capacity.length;i++){
            arr[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(extra>=arr[i]){
                extra-=arr[i];
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}