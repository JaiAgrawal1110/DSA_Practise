class Solution {
    public int clumsy(int n) {

        Stack <Integer> st=new Stack<>();
        st.push(n);
        n--;
        int op=0;
        while(n>0){
        if(op%4==0){
            st.push(n*st.pop());
        }
        else if(op % 4==1){
            st.push(st.pop()/n);
        }
         else if(op % 4==2){
            st.push(n );
        }
         else if(op % 4==3){
            st.push(-n);
        }
        op++;
        n--;
    }
    int ans=0;
    while(!st.isEmpty()){
        ans+=st.pop();

    }

    return ans;
    }
}