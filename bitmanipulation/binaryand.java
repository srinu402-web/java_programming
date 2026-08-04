package bitmanipulation;

public class binaryand {
    static void and(int n1,int n2){
        System.out.println(n1&n2);
    }
    static void or(int n1,int n2){
        System.out.println(n1|n2);
    }
    static void xor(int n1,int n2){
        System.out.println(n1^n2);
    }
    static void left(int n1,int n2){
        System.out.println(n1<<n2);
    }
    static void right(int n1,int n2){
        System.out.println(n1>>n2);
    }
    public static void main(String[]arg){
        and(5, 6);
        or(5, 6);
        xor(5, 6);
        left(5, 6);
        right(5, 6);
    }
    
}
