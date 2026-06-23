package loops;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        System.out.print("please enter the vlue of num");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if (i%2==0) {
                System.out.println(i);
                
            }
            sc.close();
        }
    }
    
}
