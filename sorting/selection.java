package sorting;

import java.util.Arrays;

public class selection {
    static void selct(int num[]){
        for(int i=0;i<num.length-1;i++){
            int min=i;
            for(int j=i+1;j<num.length;j++){
                if (num[min]>num[j]) {
                    min=j;
                   
                    }
                }
                 int temp=num[min];
                 num[min]=num[i];
                 num[i]=temp;
                   
            }
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        selct(num);

    }
    
}
