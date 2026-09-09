package recursion;

public class printnum {
    static void rev(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        rev(n-1);
        

    }
    public static void main(String[]args){
        rev(10);
    }
    
}
