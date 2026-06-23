package loops;

import java.util.Scanner;

public class whil_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        while (num<=n) {
            System.out.println(num);
             num++;
            
        }
       
        sc.close();

    }
    
}
