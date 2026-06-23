package Array;

import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int roll[]=new int[5];
        roll[0]=sc.nextInt();
        roll[1]=sc.nextInt();
        int Add=roll[0]+roll[1];
        System.out.println(roll[0]);
        System.out.println(roll[1]);
        System.out.println(Add);
        sc.close();
    
    }
    
}
