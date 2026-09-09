package oops;

public class getput {
    public static void main(String[] args) {
        pen obj=new pen();
        obj.get("green", 5);
        
        
        
    }
    
}
class pen{
     String colour;
     int tip;
    void get(String colour,int tip){
        this.colour=colour;
        this.tip=tip;
        System.out.println(colour);
        System.out.println(tip);

    }

}
