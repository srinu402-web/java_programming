package functions;

public class invertedhalfnum {

    public static int inv(int n){
        for(int row=1;row<=n;row++){
            
          for(int cal=1;cal<=n-row;cal++){
            System.out.print(cal);

          }
         
          System.out.println(" ");
        }
        return n;
    }
    public static void main(String[] args) {
        inv(6);
        
    }
    
}
