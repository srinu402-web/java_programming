package conditions;
import java.util.*;

public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if (marks>=90||marks<=100) {
            System.out.println("A grade");
            
        }else if(marks>=80||marks<=90){
            System.out.println("B grate");
        }else if (marks>=70||marks<=80) {
            System.out.println("C grade");
            
        }else{
            System.out.println("fail");
        }
        sc.close();
        
    }
    
}
