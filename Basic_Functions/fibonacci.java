import java.util.Scanner;
public class fibonacci {
    public static void fibo(int x){
        int a=0;
        int b=1;
        for(int i =0;i<x;i++){
            System.out.println(a);
           int next=a+b;
           a=b;
           b=next;

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        int n=sc.nextInt();
        fibonacci.fibo(n);

    }
    
}
