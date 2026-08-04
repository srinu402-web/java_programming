package string;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name here:");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println("your name length is="+name.length());
        sc.close();
        
    }
    
}
