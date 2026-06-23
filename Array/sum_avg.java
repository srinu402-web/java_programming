package Array;

public class sum_avg {
    public static void add(){
        int num[]=new int[4];
        num[0]=1;
        num[1]=2;
        
        
        int sum=num[0]+num[1];
        System.out.println(sum);
        
        
    }
    public static void avg(){
        int num[]={1,1,3};
        int avg=num[1]+num[2]/2;
        System.out.println(avg);

    } 
    public static void main(String[] args) {
        add();
        avg();
    }
    
}
