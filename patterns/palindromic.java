package patterns;

public class palindromic {
    public static int pal(int n){
        for(int i=1;i<=n;i++){
            
            for(int num=1;num<=i;num++){
               System.out.print(num);
            }
           
            
            for(int num=1;num<=num-i;num++){
                
            }
            System.out.println(" ");

        }
        return n;
    }
    public static void main(String[] args) {
        pal(5);
        
    }
    
}
