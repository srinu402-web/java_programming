package string;

public class reversestring {
    static void rev(char s[]){
        //two pointers
        int st=0;
        int end=s.length-1;
        while (st<end) {
            char temp=s[st];
            s[st]=s[end];
            s[end]=temp;
            st++;
            end--;
        }

    }
    public static void main(String[] args) {
        char s[]={'h','e','l','l','o'};
        rev(s);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }

        
    }
    
}
