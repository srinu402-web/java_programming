package loops;
public class prim {

    public static void main(String[] args) {
        for(int num=2;num<=100;num++){
            boolean res=true;
            for(int i=2;i<num;i++){
                if (num%i==0) {
                    res=false;
                    break;
                    
                }
            }
            if (res) {
                System.out.println(num);
                
            }
        }
    }
}