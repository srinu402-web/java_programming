package loops;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the table number=");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            int res=num*i;
            System.out.println(num+"*"+i+"="+res);
        }
        sc.close();
    }
    
}
