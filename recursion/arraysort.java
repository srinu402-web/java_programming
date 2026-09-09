package recursion;

public class arraysort {
   public static boolean sort(int num[],int i){
        if(i==num.length-1){
            return true;
        }
        if (num[i]>num[i+1]) {
            return false;
        }
        return sort(num, i+1);

    }
    public static void main(String[] args) {
        int arry[]={1,2,3,4,5};
        System.out.println(sort(arry, 0));
        
    }
    
}
