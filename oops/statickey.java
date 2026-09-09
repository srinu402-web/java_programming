package oops;



public class statickey {
    static int sta(int a,int b){
        System.out.println("decular a method static keyword");
    return a+b;

}
int nonsta(int a,int b){
    System.out.println("decular method non static keyword");
    return a*b;
}
    public static void main(String[] args) {
        System.out.println(sta(10,20));//without object
        statickey obj=new statickey();//obj creating
        System.out.println(obj.nonsta(5, 5));
        
    }
    
}

