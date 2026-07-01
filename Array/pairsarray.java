package Array;

public class pairsarray {
    static void pair(int num[]){
        int count =0;
        for(int i=0;i<=num.length-1;i++){
            for(int j=1+i;j<=num.length-1;j++){
                System.out.print("("+num[i]+","+num[j]+")");
                count++;
            }
            System.out.println("");

            
        }
        System.out.print("count="+count);
        
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8};
        pair(numbers);
    }
    
}
