package java_basics;
import java.util.Scanner;
public class swap{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" numbers before swapping");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(" numbers after swapping");
        System.out.println(a);
        System.out.println(b);
        sc.close();
       

    }
}