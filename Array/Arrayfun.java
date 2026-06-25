package Array;

public class Arrayfun {
    public static void fun(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+1);

        }
        return ;


    }
    
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
       
        fun(num);
        
    }
    
}
