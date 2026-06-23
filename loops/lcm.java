package loops;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of=");
        int a=sc.nextInt();
        System.out.print("enter the number of b=");
        int b=sc.nextInt();
        int lcm=(a>b)?a:b;
        while (true) {
            if (lcm%a==0&&lcm%b==0) {
                System.out.println("lcm="+lcm);
                break;
            }
            lcm++;
            
        }
        sc.close();
    }
    
}
