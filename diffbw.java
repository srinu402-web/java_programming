public class diffbw {
    public static void main(String[] args) {
        double x_1=2;
        double x_2=4;
        double y_1=3;
        double y_2=6;
        double res=Math.pow(x_2-x_1,2);
        double re=Math.pow(y_2-y_1,2);
        double dist=res+re;
        System.out.println(Math.sqrt(dist));
    }
    
}
