package bitmanipulation;

public class evenornot {
    static void even(int n){

        if ((n&1)==0) {
            System.out.println("n is even");
            
        }else{
            System.out.println(" n is odd");
        }
    }
    public static void main(String[] args) {
        even(5);
        even(4);
        even(6);
        
    }
    
}
