package bitmanipulation;

public class clearithbit {
    static int clear(int n,int i){
        return n&~(1<<i);
    }
public static void main(String[] args) {
    System.out.println(clear(13, 2));
    
}
    
}
