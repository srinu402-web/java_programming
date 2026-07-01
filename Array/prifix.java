package Array;


public class prifix {
    static void pri(int num[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int prifix[]=new int[num.length];
        prifix[0]=num[0];
        for(int i=1;i<=num.length-1;i++){
            prifix[i]=prifix[i-1]+num[i];
        }
        for(int i=0;i<=num.length-1;i++){
            int start=i;
            for(int j=i;j<=num.length-1;j++){
                int end=j;
                sum=start==0?prifix[end]:prifix[end]-prifix[start-1];
                if (max<sum) {
                    max=sum;
                    
                }
             }
        }
        System.out.println(max);
        
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        pri(num);
    }
    
}
