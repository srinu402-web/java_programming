package conditions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num%2!=0||num==2) {
            
            System.out.println("prime");
            
        }else{
            System.out.println("not prime");
        }
        sc.close();
    }
    
}
