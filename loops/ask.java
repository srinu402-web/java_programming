package loops;

import java.util.Scanner;

public class ask {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int res=0;
        while (true) {
            System.out.print("enter the number=");
            num=sc.nextInt();
            res+=num;
            if (num<0) {
                break;
            }else{
                continue;
            }

            
        }
        
        System.out.print("final sum is="+res);
        sc.close();
    }
}