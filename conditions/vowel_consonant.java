package conditions;

public class vowel_consonant {
    public static void main(String[] args) {
        char ch=Character.toLowerCase('E');
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
            System.out.println("vowel");
            
        }else if (Character.isLetter(ch)) {
            System.out.println("consonant");
            
        }else{
            System.out.println("not a alphabet");
        }
        
    }
    
}
