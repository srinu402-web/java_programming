package linearSearch;

public class countoccurrence {
    static int cou(int num[],int target){
        int occurence=0;
        for(int i=0;i<num.length;i++){
            if (num[i]==target) {
                occurence++;
                
            }
        }return occurence;
    }
    public static void main(String[] args) {
        int number[]={2,5,2,7,2,9};
        System.out.println(cou(number, 0));
    }
    
}
