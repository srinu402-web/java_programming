package functions;

import java.util.Scanner;

public class area_circle {
    public static int area(int r){
        int area=2*r;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the radius");
        int radius=sc.nextInt();
        int area=area(radius);
        System.out.println("area of circle="+area);
        sc.close();


    }
    
}
