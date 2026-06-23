package patterns;

public class diamond {
    public static int dia(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            for(int star=1;star<=i-1;star++){
                System.out.print("*");
            }
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            
            
            System.out.println(" ");
        }
        return n;
    }
    public static int bo(int n){
        for(int i=n;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            for(int star=1;star<=i-1;star++){
                System.out.print("*");
            }
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
        
            
            

            System.out.println("");
        }
        return n;
    }
    public static void main(String[] args) {
        dia(4);
        bo(4);
        
    }
    
}
