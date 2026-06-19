import java.util.Scanner;
class Operations {
    public static void Sum(int x,int y) {
       int sum=x+y;
        System.out.println("The sum of two numbers is "+sum);
    }

    public static void Multiply(int x, int y ){
        int product=x*y;
        System.out.println("The product is "+product);
    }

    public static void Subtraction(int x,int y){
        int diff=x-y;
        System.out.println("The differnce is "+diff);
    }
}

class reverse{
    public reverse(int x){
        int rev=0;
        while(x!=0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        System.out.println("The reverse of the first number is "+rev);

    }

}

public class sum {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to be summed ");
        int a =sc.nextInt();
        int b=sc.nextInt();
        Operations.Sum(a,b);
        Operations.Multiply(a,b);
        Operations.Subtraction(a,b);
        new reverse(a);
    }
}
