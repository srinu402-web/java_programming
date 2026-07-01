package Array;
public class piotindex {
    static int sum(int num[]){
        int totalsum=0;
        for(int i=0;i<=num.length-1;i++){
            totalsum=num[i]+totalsum;

        }
        return totalsum;
    }
    static int pio(int nums[]){
        int totalsum=sum(nums);
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<=nums.length-1;i++){
            leftsum=i==0?0:nums[i-1]+leftsum;
            rightsum=totalsum-leftsum-nums[i];
            if (leftsum==rightsum) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,7,3,6,5,6};
        System.out.println(pio(nums));
    }
    
}
