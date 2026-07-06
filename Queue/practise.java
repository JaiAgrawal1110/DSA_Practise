package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class practise {
    public static void main(String[] args) {
        
        Queue <Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
      //  System.out.println(q.remove());
        
        //System.out.println(q);
       int n =q.size();
       int x=0;
       for(int i=0;i<3;i++){
        x=q.remove();
        q.add(x);
       }   
       q.add(60);
        System.out.println(x);
        for(int i=0;i<n-3;i++){
        x=q.remove();
        q.add(x);
       }  
       System.out.println(q);
        
    }
}
