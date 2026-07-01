package Binarysearch;

public class findcelling {
    //If num[mid] > target → this might be the ceiling.
    static int cel(int num[],int target){
        int start=0;
        int res=-1;
        int end=num.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                return num[mid];
                
            }else if (num[mid]<target) {
                start=mid+1;
                
            }else{
                res=num[mid];
                end=mid-1;
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        int numbers[]={2,5,8,10,15};
        System.out.println(cel(numbers, 11));
        
    }
    
}
