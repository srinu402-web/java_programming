package conditions;

public class calculater {
    public static void main(String[] args) {
        int a=10;
        int b=29;
        int num=0;
        switch (num) {
            case 1:System.out.println(a+b);
                
                break;
            case 2:System.out.println(a-b);
                break;
            case 3:System.out.println(a/b);
                break;
            case 4:System.out.println(a%b);
                break;
        
            default:System.out.println("error");
                break;
        }
    }
    
}
