package Array;

public class prifixopti {
    static int pri(int num[]){
        int currentsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=num.length-1;i++){
            currentsum+=num[i];
            if (currentsum>max) {
                max=currentsum;
            }
            if (currentsum<0) {
                currentsum=0;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int[] num={1,-2,6,-1,3};
        System.out.println(pri(num));
        
    }
    
}
