package Array;

public class maximum {
    public static void max(int num[]){
       int maxima=Integer.MIN_VALUE;
       for(int i=0;i<num.length;i++){
            if(num[i]>maxima){
               maxima=num[i];
        }
       }
       System.out.println(maxima);
    }
    public static void min(int num[]){
        int minima=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if (minima>num[i]) {
                minima=num[i];
                
            }
            
        }
        System.out.println(minima);
    }

    public static void main(String[] args) {
        int number[]={1,2,10,15,5};
        max(number);
        min(number);        
    }
    
}
