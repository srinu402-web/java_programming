package oops;
/**
 * exceptionhandle
 */
public class exceptionhandle {

    public static void main(String[] args) {
        try{
        int a=10;
        int b=0;
        int res=a/b;
        System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("0 can not divide 10");

        }
        finally{
            System.out.println("program was contineous");
        }
    }
}