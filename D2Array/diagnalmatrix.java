package D2Array;
public class diagnalmatrix {
    static int sum(int num[][]){
        int r=num.length;
        int sum=0;
        for(int i=0;i<r;i++){
          
                sum+=num[i][i];
                if (i!=r-i-1) {
                    sum+=num[i][r-i-1];
                    
                }
            }
        
        return sum;
    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(num));
    }
    
}
