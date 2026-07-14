package D2Array;

public class sumallelements {
    static int sum(int num[][]){
        int sum=0;
        int n=num.length;
        int m=num[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=num[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(num));
    }
    
}
