class Solution {
    public int totalNumbers(int[] digits) {
        boolean [][][] used=new boolean[10][10][10];
        int count=0;
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i==j||j==k||k==i){
                        continue;
                    }
                    int a = digits[i];
                    int b = digits[j];
                    int c = digits[k];
                    if(a==0){
                        continue;
                    }
                    if(c%2!=0){
                        continue;
                    }
                    if (!used[a][b][c]) {
                        used[a][b][c] = true;
                        count++;
                    }


                }
            }
        }
            return count;
    }
}