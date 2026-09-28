package oops;
class m1{
    //two or more method names are same and also parameter list are same but different class
    void method(){
        System.out.println("hi");
    }
}
class m2 extends m1{
    
    void method(){
     //immediate call of parent class
        super.method();
        System.out.println("hello");
    }
}

public class Methodoverride {
    public static void main(String[] args) {
        m2 obj=new m2();
        obj.method();
        
    }
    
}
