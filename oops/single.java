package oops;
class parent{
    void x(){
        System.out.println("hello");
    }
}
class child extends parent{
    void y(){
        System.out.println("hi");
    }
}
public  class single {

    public static void main(String[] args) {
        child obj=new child();
        obj.x();
        obj.y();
        
    }
}