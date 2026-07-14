package D2Array;
import java.util.*;

public class search {
    static int[] sea(int num[][],int target){
        int n=num.length;
        int m=num[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (num[i][j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(Arrays.toString(sea(num, 10)));

    }
    
}
