package Binarysearch;

public class notfound {
    static int not(int num[],int target){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                return mid;
                
                
            }else if (target>num[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,4,6,9,12};
        System.out.println(not(numbers, 7));
    }
    
}
