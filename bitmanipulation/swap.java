package bitmanipulation;

public class swap {
    static void swapnum(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a is="+a);
        System.out.println("b is="+b);
    }
    public static void main(String[] args) {
        swapnum(10, 5);
        
    }
    
}
