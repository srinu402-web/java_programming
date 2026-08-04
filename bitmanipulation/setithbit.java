package bitmanipulation;

public class setithbit {
    static int set(int n,int i){
        return n|1<<i;
    }
    public static void main(String[] args) {
        System.out.println(set(10, 2));
        
    }
    
}
