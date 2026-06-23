package conditions;

import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter selling price=");
        int sell=sc.nextInt();
        System.out.print("enter the cost=");
        int cost=sc.nextInt();
        int profit;

        if (sell>cost) {
            profit=sell-cost;
            System.out.println("profit"+" "+profit);
            
        }else{
            profit=cost-sell;
            System.out.println("loss"+ " " +profit);
        }
        sc.close();

    }
    
}
