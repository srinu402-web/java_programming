package patterns;

public class hellorhombus {
    public static int helo(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=n;star++){
                if(i==1||i==5||star==1||star==5){

                
               System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        return n;

    }
    public static void main(String[] args) {
        helo(5);
        
    }
    
}
