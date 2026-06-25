package Array;
public class linearsearch {
    public static int lin(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
                
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {

        int num[]={2,4,6,8,10,12,14,16};
        int index=lin(num, 12);
        System.out.println(index);
        
    }
}