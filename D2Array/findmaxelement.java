package D2Array;
import java.util.*;

public class findmaxelement {
    static int[] max(int num[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=num.length;
        int m=num[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (num[i][j]>max) {
                    max=num[i][j];
                } 
                if (num[i][j]<min) {
                    min=num[i][j];
                    
                }
                
            }
        }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,15,6},{7,8,9}};
        System.out.println(Arrays.toString(max(num)));
    }
    
}
