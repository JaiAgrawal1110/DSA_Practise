import java.util.Scanner;
public class functions {
    public static int Fact(int n){
        int ans=1;
        while(n>0){
            ans=n*ans;
            n--;
        }
        System.out.println("The factorial of the number is: " +ans);
        return ans;
    }

    public static void Palindrome(int x){
        int rev,original;
        original=x;
        rev=0;
        while(original>0){
            int digit=original%10;
            rev=rev*10+digit;
            original=original/10;
        }
        if (rev==x){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
     String name=sc.nextLine();
     System.out.println("Hello "+name);
     System.out.println("Enter your number");
     int num=sc.nextInt();
     //functions.Fact(num);
     functions.Palindrome(num);
}
}

