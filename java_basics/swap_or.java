package java_basics;
public class swap_or {
    public static void main(String[]args){
        int a=300;
        int b=100;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("the value of a is="+a);
        System.out.println("the value of b is="+b);
    }
    
}
