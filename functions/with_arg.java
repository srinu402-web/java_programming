package functions;

public class with_arg {
    public static int add(int a,int b){
        int sum=a+b;
        return sum;
       

    }
    public static void main(String[] args) {
        int c=10;
        int d=30;
        int add=add(c, d);
        System.out.println(add);
    }
    
}
