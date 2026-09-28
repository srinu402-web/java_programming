package oops;
 final class y{
    //final method prevent the methodoverride
    //final class prevent inheritance
    //final variable restract the updation of value
    final void  x(){
        System.out.println("hi");
    }

}

public class Finalkeyword {
    public static void main(String[] args) {
        y obj=new y();
        obj.x();
        
    }
    
}
