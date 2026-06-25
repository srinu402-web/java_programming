package linearSearch;

public class searchchar {
    static int sear(char name[],char target){
        for(int i=0;i<name.length;i++){
            if (name[i]==target) {
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //use String also
        char names[]={'p','r','o','g','r','a','m','m','i','n','g'};
        System.out.println(sear(names, 'g'));
    }
    
}
