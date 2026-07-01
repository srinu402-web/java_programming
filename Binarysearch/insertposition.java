package Binarysearch;

public class insertposition {
    static int ins(int num[],int target){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                return mid;
            }else if (num[mid]<target) {
                start=mid+1;
                
            }else{
                num[mid]=target;
                end=mid-1;
                
            }
            
        }
        return start;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,5,6};
        System.out.println(ins(numbers,1));
        
    }
    
}
