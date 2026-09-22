package Array;

import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arry[]=new int[size];
        System.out.println("Enter the Numbers");
        for(int i=0;i<size;i++){
            arry[i]=sc.nextInt();
        }
        System.out.println("Array num");
        for(int i=0;i<size;i++){
            System.out.println(arry[i]);
        }
        sc.close();
    
    }
    
}
