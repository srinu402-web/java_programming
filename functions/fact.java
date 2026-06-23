package functions;

public class fact {
    public static int f(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }
    public static int bio(int n,int r){
        int n_fact=f(n);
        int r_fact=f(r);
        int fact=f(n-r);
        int factorial=n_fact/(fact*r_fact);
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(bio(5, 3));       
    }
    
}
