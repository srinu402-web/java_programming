package recursion;

public class febanacci {
   static int feb(int n){
       if (n==0||n==1) {
        return n;
        
       }
       int fn1=feb(n-1);
       int fn2=feb(n-2);
       int febn=fn1+fn2;
       return febn;

    }
    public static void main(String[] args) {
        System.out.println(feb(6));
        
    }
    
}
