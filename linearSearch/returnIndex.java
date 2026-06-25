package linearSearch;

public class returnIndex {
    static int in(int num[],int target){
        for(int i=0;i<num.length;i++){
            if (num[i]==target) {
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={5,8,10,15,20};
        System.out.println(in(numbers, 100));
    }
    
}
