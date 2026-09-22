package oops;
class grand{
    void x(){
        System.out.println("grandparent");
    }
}
class parent extends grand{
    void y(){
        System.out.println("parent");
    }
}
class child extends parent{
    void z(){
        System.out.println("child");
    }
}
class childtwo extends child{
    void a(){
        System.out.println("child1");
    }
}

public class hybridinheritance {
    public static void main(String[] args) {
        childtwo obj=new childtwo();
        obj.z();
        obj.x();
        obj.z();
        obj.a();
        
    }
    
}
