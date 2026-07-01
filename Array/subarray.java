package Array;

public class subarray {
    static void sub(int num[]){
        int count=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=num.length-1;i++){

            for(int j=i;j<=num.length-1;j++){
                    int sum=0;

                for(int k=i;k<=j;k++){
                    System.out.print(num[k]);
                    sum=sum+num[k];
                    
                
                
            }
            count++;
                    System.out.println(" ");
                   System.out.println("sum="+sum);
            if(sum>max){
                        max=sum;
                    }else if(sum<min){
                        min=sum;
                    }
                }
        }
        System.out.println("total count="+count);
        System.out.println("maximum="+max);
        System.out.println("min="+min);
        

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3};
       sub(numbers);
    }
    
}
