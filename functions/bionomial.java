package functions;

public class bionomial {
    public static int fact(int n){
        int f=1;
        for(int i=n;i<=1;i--){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        
         System.out.println(fact(5));
    }
    
}
