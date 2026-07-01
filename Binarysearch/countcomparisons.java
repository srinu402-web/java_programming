package Binarysearch;

public class countcomparisons {
    static int count(int num[],int target){
        int start=0;
        int end=num.length-1;
        int coun=0;
        while (start<=end) {
            int mid=start+(end-start)/2;
              coun++;
            if (num[mid]==target) {
                return coun;
                
            }else if (num[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
       
        return coun;
    }
    public static void main(String[] args) {
        int numbers[]={2,5,8,10,15,20};
        System.out.println(count(numbers, 20));
        
    }
    
}
