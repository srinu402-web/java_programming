package linearSearch;

public class firsteven {
    static int firsteve(int num[]){
        for(int i=0;i<num.length;i++){
            if (num[i]%2==0) {
                //it stops the entair method 
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,19,24,30};
        System.out.println(firsteve(numbers));
    }
    
}
