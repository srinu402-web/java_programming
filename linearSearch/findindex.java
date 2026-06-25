package linearSearch;

public class findindex {
    static void fin(int num[],int key){
        for(int i=0;i<num.length;i++){
            if (num[i]==key) {
               
                System.out.print(i+" ");
             }
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,2,5,2};
        fin(numbers, 2);

    }
    
}
