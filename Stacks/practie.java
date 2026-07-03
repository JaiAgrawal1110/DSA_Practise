package Stacks;
import java.util.Stack;
public class practie {
    public static void main(String[] args) {
   Stack<Integer> st=new Stack<>();
    // System.out.println(st.isEmpty());
    st.push(50);
   // System.out.println(st.peek());
        st.push(10);
        st.push(20);
     //   System.out.println(st.peek());
      //  System.out.println(st);
       System.out.println(st.size());
      //  System.out.println(st.isEmpty());
        int [] ans=new int[st.size()];
        int i=0;
         while(st.size()>0){
        System.out.println(st.pop());
        
       }
       // while(i<=ans.length-1){
         //   ans[i]=st.pop();
            //System.out.print(ans[i]);
         //   i++;
      // }
      


    }

    
}
