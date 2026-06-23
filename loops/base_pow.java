package loops;

import java.util.Scanner;

public class base_pow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the base value=");
        int base=sc.nextInt();
        System.out.print("enter the exponational value=");
        int exponational=sc.nextInt();
        int res=1;
        for(int i=1;i<=exponational;i++){
            res*=base;

        }
        System.out.print("result="+res);
        sc.close();

    }
    
}
