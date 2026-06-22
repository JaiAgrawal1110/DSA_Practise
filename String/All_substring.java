package String;
import java.util.Scanner;
public class All_substring {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
       //System.out.println("Start small. Ship something.");
       Scanner sc=new Scanner(System.in);
       String s= sc.nextLine();
       System.out.println(s);
       for(int i=0;i<s.length();i++){
           for(int j=i+1;j<=s.length();j++)
          // System.out.print(s.charAt(j)+" ");
           System.out.print(s.substring(i,j)+" ");
       }
    }
}
    

