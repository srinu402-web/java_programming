package D2Array;


public class rowsum {
    static void rowsu(int num[][]){
        int row=num.length;
        int columns=num[0].length;
        for(int i=0;i<row;i++){
            int sum=0;
          for(int j=0;j<columns;j++){
                sum+=num[i][j];
                
            }
            System.out.println(i+"rowsum="+sum);
        }
    }
    static void columnsum(int num[][]){
        int row=num.length;
        int columns=num[0].length;
        for(int i=0;i<columns;i++){
              int sum=0;
            for(int j=0;j<row;j++){
                sum+=num[j][i];
                
            }
            System.out.println(i+"columns="+sum);
        }
    }
    static int diagnal(int num[][]){
        int r=num.length;
        int c=num[0].length;
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (i==j) {
                    sum+=num[i][j];
                    
                }
            }
        }
        return sum;
    }
    static int di(int num[][]){
        int sum=0;
        int n=num.length;
        int m=num[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (i+j==n-1) {
                    sum+=num[i][j];
                    
                }

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int num[][]={{1,2,3},{4,5,6},{7,8,9}};
        rowsu(num);
        columnsum(num);
        System.out.println("Diagnalsum="+diagnal(num));
        System.out.println(di(num));
    }
    
}
