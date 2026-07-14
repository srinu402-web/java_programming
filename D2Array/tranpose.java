package D2Array;

public class tranpose {
    static void tra(int num[][]){
        int n=num.length;
        int m=num[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(num[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        tra(num);

    }
    
}
