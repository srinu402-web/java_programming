package loops;

import java.util.Scanner;

public class fact {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter factorial=");
    int num=sc.nextInt();
    int fact=1;
    for(int i=num;i>=1;i--){
        fact*=i;
    }
    System.out.println("factorial="+fact);
    sc.close();
}    
}
