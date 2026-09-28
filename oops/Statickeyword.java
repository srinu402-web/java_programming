package oops;
class sample{
    static int  y=10;
    static void method(){
        System.out.println("hello");
    }
}
class nonstatic{
    void x(){
        System.out.println("srinu");
    }
}

public class Statickeyword {
    public static void main(String[]args){
        sample.method();
        System.out.println(sample.y);
        nonstatic obj=new nonstatic();
        obj.x();

    }
    
}
