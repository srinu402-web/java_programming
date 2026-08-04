package string;

public class traversal {
    static void tra(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println(" ");
        
        System.out.println("length of name="+name.length());

    }
   public static void main(String[] args) {
        String name="venkat";
        tra(name);

   }    
}
