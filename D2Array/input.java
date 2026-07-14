package D2Array;
import java.util.*;

public class input {
    public static void main(String[] args) {
        
         int num[][]=new int[3][3];
         int n=num.length; 
         int m=num[0].length;
         Scanner sc=new Scanner(System.in);
         System.out.print("enter nine numbers");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num[i][j]=sc.nextInt();

            }
        }
        System.out.println("matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(num[i][j]+" ");

            }
            System.out.println("");
        }
        sc.close();
    }
    
}
