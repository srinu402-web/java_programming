package conditions;
import java.util.*;
public class laeayear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int year=sc.nextInt();
         String res=(year%4==0&&year%100!=0||year%400==0)?" leap year":"not leapyear";
         System.out.println(res);
         sc.close();

        
    }
}
