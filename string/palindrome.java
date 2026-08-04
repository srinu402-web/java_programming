package string;

public class palindrome {
    static boolean pal(String nam){
        int s=0;
        int e=nam.length()-1;
        while (s<e) {
            if (nam.charAt(s)!=nam.charAt(e)) {
                return false;
            }
            s++;
            e--;
            
        }
        return true;
    }
    public static void main(String[] args) {
        String name="hello";
        System.out.println(pal(name));

    }    
}
