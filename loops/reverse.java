package loops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        long num=sc.nextInt();
        while (num>0) {
            long rever=num%10;
            System.out.print(rever);
            num=num/10;
            
        }
         sc.close();
    }
    
}
