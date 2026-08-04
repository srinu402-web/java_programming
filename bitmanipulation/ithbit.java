package bitmanipulation;

public class ithbit {
    static int  i(int n,int i){
        if ((n&1<<i)==0) {
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
      System.out.println(  i(10, 3));
        i(10, 2);
        i(10, 3);
    }
    
}
