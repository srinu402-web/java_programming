package functions;

public class floydstriangle {
    public static int Inner(int n) {
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+num);
                num++;
                
            }
           
            System.out.println();
            
        }
        return n;
    
        
    }
    public static void main(String[] args) {
        Inner(5);
        
    }
    
}
