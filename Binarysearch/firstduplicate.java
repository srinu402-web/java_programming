package Binarysearch;
import java . util .Arrays;


public class firstduplicate {
    
    static int first(int num[],int target){
        int start=0;
        int end=num.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                res=mid;
                end=mid-1;
                
            }else if (num[mid]<target) {
                start=mid+1;
                
            }else{
                end=mid-1;
            }
        }
        return res;
    }
        static int last(int num[],int target){
        int start=0;
        int end=num.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (num[mid]==target) {
                res=mid;
                start=mid+1;
                
            }else if (num[mid]<target) {
                start=mid+1;
                
            }else{
                end=mid-1;
            }
        }
        return res;
    }
    static int[] two(int num[],int target){
        int firstoc=first(num, target);
        int secon=last(num, target);
        return new int[]{firstoc,secon};
    }
    public static void main(String[] args) {
        int numbers[]={2,4,4,4,6,8};
        System.out.println(Arrays.toString (two(numbers, 4)));

    }
    
}
