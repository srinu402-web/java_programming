package conditions;

import java.util.Scanner;

public class seasons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
       
            if (month==12||month==1||month==2) {
                System.out.println("winter");
                
            }else if (month>=3&&month<=5) {
                System.out.println("spring");
                
            }else{
                System.out.println("fall");
            }
            sc.close();
        }
       
    }
    

