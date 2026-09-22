package oops;
class subclass{
    void parent(){
        System.out.println(" parent class");
    }
}
class childone extends subclass{
    void child1(){
        System.out.println("child1");
    }

}
class childtwo extends subclass{
    void child2(){
        System.out.println("child2");
    }
}

public class hirachicalinheritance {
    public static void main(String[] args) {
        childtwo obj=new childtwo();
        obj.parent();
        obj.child2();
        
    }
    
}
