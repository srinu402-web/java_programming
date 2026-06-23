package conditions;

public class chaldg {
    public static void main(String[] args) {
        int ch='@';
        if(Character.isAlphabetic(ch)){
            System.out.println("alphabet");
        }else if (Character.isDigit(ch)) {
            System.out.println("digit");
            
        }else{
            System.out.println("special charecter");
        }
    }
    
}
