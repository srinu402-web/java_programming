package oops;
abstract class x{
    abstract void method();
    final static int num=10;
    void m2(){
        System.out.println("Srinu");
    }
}
class y extends x{
    void method(){
        System.out.println("hello");
    }
}

public class Abstractkeyword {
    public static void main(String[] args) {
        y obj=new y();
        obj.method();
        System.out.println(x.num);
        obj.m2();
        
    }
    
}
