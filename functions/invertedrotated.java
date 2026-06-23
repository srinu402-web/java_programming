package functions;
public class invertedrotated {
    public static int inv(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int cal=1;cal<=row;cal++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return n;

    }

    public static void main(String[] args) {
        inv(4);
        
    }
}