package Array;

public class maxsubarray {
    static int max(int num[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=num.length-1;i++){
            int start=i;
            for(int j=i;j<=num.length-1;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=num[k];
                }
                if (sum>max) {
                    max=sum;
                    
                }
                
                
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        System.out.println(max(numbers));
    }
    
}
