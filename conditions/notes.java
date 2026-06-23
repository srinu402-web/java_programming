package conditions;

import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the amount");
        int amount=sc.nextInt();
        System.out.println("please enter which type of notes require");
        int notes=sc.nextInt();
        switch (notes) {
            case 500:System.out.println("total no of notes=" + amount/notes);
                
                break;
            case 200:System.out.println("total no of notes ="+ amount/notes);
                break;
            case 100:System.out.println("total no notes=" + amount/notes);
                break;

        
            default:System.out.println("wrong amount");
                break;

        }
        sc.close();

    }
    
}
