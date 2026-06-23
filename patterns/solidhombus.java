package patterns;

public class solidhombus {
    public static int he(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return n;
    }
    public static void main(String[] args) {
        he(5);
        
    }
    
}
