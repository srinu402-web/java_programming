package oops;
class grand{
    void x(){
        System.out.println("hi");
    }
}
class parent extends grand{
    void y(){
        System.out.println("hello");
    }
}
class child extends parent{
    void z(){
        System.out.println("this is child class");
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
        child obj=new child();
        obj.y();
        obj.z();
        obj.x();

        
    }
    
}
