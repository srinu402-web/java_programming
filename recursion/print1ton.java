package recursion;

public class print1ton {
    void num(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
       
        num(n-1);
         System.out.println(n);
    }
    public static void main(String[] args) {
        print1ton obj=new print1ton();
        obj.num(10);
        
    }
    
}
