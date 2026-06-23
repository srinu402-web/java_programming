package java_basics;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter your name:");
        String name=sc.next();
        System.out.println("name is " +name);
        System.out.print("please enter your Age:");
        int age=sc.nextInt();
        System.out.println(" Age is" +age);
        System.out.print("please enter your salery:");
        int salery=sc.nextInt();
        System.out.println("your salery is:"+salery);
        sc.close();
        
    }
    
}
