package patterns;

public class numberpyramid {
    public static int num(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int num=1;num<=i;num++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        return n;
    }
    public static void main(String[] args) {
        num(5);
        
    }
    
}
