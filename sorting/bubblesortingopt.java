package sorting;

public class bubblesortingopt {
    static void bubble(int num[]){
        int n=num.length-1;
        for(int i=0;i<n;i++){
            boolean swap=false;
            for(int j=0;j<n-i;j++){
                if(num[j]>num[j+1]){
                int temp=num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
                swap=true;
                }
                
            }
            if (swap==false) {
                break;
            }
        }
        for(int i=0;i<=n;i++){
            System.out.print(num[i]);
        }
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,3,2};
        bubble(nums);
    }
    
}
