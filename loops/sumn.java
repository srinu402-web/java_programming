package loops;

import java.util.Scanner;

public class sumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        int sum=0;
        for(int num=1;num<=n;num++){
            sum+=num;
        }
        System.out.println(sum);
        sc.close();
    
}
    
}
