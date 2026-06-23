import java.util.Scanner;
public class area_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter radius:");
        double radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println(area);
        sc.close();

        
    }
    
}
