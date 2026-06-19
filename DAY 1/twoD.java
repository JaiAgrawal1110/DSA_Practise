import java.util.*;
public class twoD {
    public static void main(String args[]){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        n=sc.nextInt();
        System.out.println("Enter number of columns:");
        m=sc.nextInt();
        int twoD[][]=new int[n][m];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                twoD[i][j]=sc.nextInt();
            }
        }
        System.out.println("Which element to be discovered:");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(twoD[i][j]==key){
                    System.out.println("Element found at index: "+i +" "+j);
                }

            }
        }
        
    }
    
    
}
