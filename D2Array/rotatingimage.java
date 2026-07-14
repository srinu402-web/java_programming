package D2Array;

public class rotatingimage {
    static void rotate(int num[][]){
       int n=num.length;
       int c=num[0].length;
       int res[][]=new int[n][c];
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                res[j][n-i-1]=num[i][j];
            }
        }
    for (int i = 0; i < n; i++) {
    for (int j = 0; j < c; j++) {
        System.out.print(res[i][j] + " ");
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(num);
    }
    
}
