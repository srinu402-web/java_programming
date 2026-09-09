package java_basics;

public class typevar {
    public static void main(String[] args) {
        TypeVariable obj=new TypeVariable();
        obj.sample();

   }
}
class TypeVariable{
        int a=10;//instanteneous variable scope class only
        
        void sample(){
            int b=20;//globel variables life time is only method
            int res=a+b;
            System.out.println(res);
            
        }
       
    }
