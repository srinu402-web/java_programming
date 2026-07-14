package D2Array;

public class movz {
    static void mov(int num[][]){
         int r=num.length;
         int c=num[0].length;
         
        boolean ro[]=new boolean[r];
        boolean co[]=new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(num[i][j]==0){
                    ro[i]=true;
                    co[j]=true;
                    
                }
            }
        }//row
        for(int i=0;i<r;i++){
            
            if(ro[i]){
            for(int j=0;j<c;j++){
            num[i][j]=0;
            }
            }
        

        }//col
        for(int j=0;j<c;j++){
            if(co[j]){
            for(int i=0;i<r;i++){
            num[i][j]=0;
            }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(num[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int num[][]={{1,1,1},{1,0,1},{1,1,1}};
        mov(num);
    }
}
