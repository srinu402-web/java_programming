package conditions;
import java.util.*;

public class typetri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a==b&&b==c) {
            System.out.println("eqilateral triangle");
            
        }else if(a==b||b==c||a==c){
            System.out.println("isosceless triangle");
        }else{
            System.out.println("scaler");
        }
        sc.close();
        
    }
    
}
