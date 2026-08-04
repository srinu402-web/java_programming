package oops;
class Addition{
     int add(int a,int b){
        int res=a+b;
        return res;
    }
}

public class classobject {
    public static void main(String[]args){
        Addition obj=new Addition();
       System.out.println( obj.add(20, 30));
    }
    
}
