package linearSearch;

public class findTarget {
    static boolean lin(int num[],int target){
        for(int i=0;i<num.length;i++){
            if (num[i]==target) {
                return true;
                }
                
        }
        return false;
    } 
    public static void main(String[] args) {
        int numbers[]={12,45,67,23,89};
        System.out.println(lin(numbers, 23));

    }
    
}
