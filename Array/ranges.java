package Array;

public class ranges {
    static int prifi(int num[],int left,int right){
        int prifix[]=new int[num.length];
        prifix[0]=num[0];
        
        
        for(int i=1;i<=num.length-1;i++){
            prifix[i]=num[i]+prifix[i-1];
        }
        if (left==0) {
            return right;
        }
        return prifix[right]-prifix[left-1] ;
 }
    
    public static void main(String[] args) {
        int nums[]={-2,0,3,-5,2,-1};
        System.out.println(prifi(nums, 0, 2));
      
    }
    
}
