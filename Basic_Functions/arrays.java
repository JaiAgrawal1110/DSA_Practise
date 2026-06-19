import java.util.*;
public class arrays {
    public static void main(String[] args) {
        int marks[]={1,2,3,4,45,5,6,7,8};
        System.out.println(marks[4]);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}
