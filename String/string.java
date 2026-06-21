package String;
import java.util.Scanner;
public class string{
    public static void main (String[]args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("What is ur name?");
        String s= sc.nextLine();
        System.out.println("Myname is "+ s);
        System.out.println(s.charAt(6));
        System.out.println(s.length());
    }
}

