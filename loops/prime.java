package loops;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean res=true;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                res=false;
            }
            
        }
            if (res==true) {
                System.out.println("prime");
                
            }else{
                System.out.println("not prime");
            }
            sc.close();
        
    }
}