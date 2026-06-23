import java.util.Scanner;

public class largest_two_numbers {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a=");
        int a=sc.nextInt();
        System.out.print("enter the value of b=");
        int b=sc.nextInt();
        String grate=(a>b&&b<a)?"a grter":"b grater";
        System.out.println(grate);
        sc.close();
        

    }
    
}
