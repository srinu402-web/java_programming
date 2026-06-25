package linearSearch;

public class largestvalue {
    static int largestelement(int num[]){
        int larger=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if (num[i]>larger) {
                larger=num[i];
                
            }

        }
        return larger;

    }
    public static void main(String[] args) {
        int[] number={12,55,3,87,45};
        System.out.println(largestelement(number));
    }
    
}
