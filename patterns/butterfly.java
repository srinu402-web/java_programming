package patterns;
public class butterfly{
    public static  int but(int n)  {
        for(int i=1;i<=n;i++){
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            for(int space=1;space<=2*(n-i);space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return n;

    
        
    }
    public static int bo(int n){
        for(int i=1;i<=n;i++){
            for(int star=1;star<=n-i+1;star++){
                System.out.print("*");
            }
            for(int space=1;space<=2*(i-1);space++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return n;
    }
    public static void main(String[] args) {
        but(4);
        bo(4);
        
    }
}