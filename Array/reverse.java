package Array;

public class reverse {
    public static void rev(int num[]){
        int start=0;
        int end=num.length-1;
        while (start<end) {
            int tem=num[start];
            num[start]=num[end];
            num[end]=tem;
            start++;
            end--;
            
        }
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        rev(number);
    }
    
}
