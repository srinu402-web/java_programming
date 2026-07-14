package sorting;

import java.util.Arrays;

public class insertsort {
    static void ins(int num[]){
        for(int i=1;i<num.length;i++){
            int key=num[i];
            int pre=i-1;
            while (pre>=0&&num[pre]>key) {
                num[pre+1]=num[pre];
                pre--;
            }
            num[pre+1]=key;
        }
        System.out.print(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        ins(num);
    }
    
}
