package linearSearch;

public class lastoccurance {
    static int last(int num[],int target){
        int res=-1;
        for(int i=0;i<num.length;i++){
            if (num[i]==target) {
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int numbers[]={4,2,5,2,7,2};
        System.out.println(last(numbers, 2));
        
    }
    
}
