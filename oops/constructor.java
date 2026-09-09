package oops;

public class constructor {
    public static void main(String[] args) {
        student obj=new student();
        System.out.println(obj.name);
        System.out.println(obj.roll);
        student s=new student(403, "venky");
        System.out.println(s.name);
        System.out.println(s.roll);
        
    }
    
}
class student{
    public String name;
    int roll;
    student(){
        this.name="Srinu";
        this.roll=402;
    }
    student(int roll,String name){
      this.name=name;
      this.roll=roll;
     
    }
}
