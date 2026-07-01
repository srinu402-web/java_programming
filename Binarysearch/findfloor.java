package Binarysearch;

public class findfloor {
//Largest number less than or equal to the target (≤)
    static int floor(int num[],int target){
        int start =0;
        int end=num.length-1;
        int res=-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                return num[mid];
            }else if (num[mid]<target) {
                res=num[mid];
                start=mid+1;
                
            }else{
                end=mid-1;
            }
            
        }
      return res;

    }
    public static void main(String[] args) {
        int numbers[]={2,5,8,10,15};
        System.out.println(floor(numbers, 10));
        
    }
    
}
