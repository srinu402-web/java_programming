package linearSearch;

public class small {
    static int smallestvalu(int num[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if (num[i]<small) {
                small=num[i];
                
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int [] numbers={22,5,90,1,13};
        System.out.println(smallestvalu(numbers));
    }
    
}
