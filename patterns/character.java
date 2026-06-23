package patterns;

public class character {
    public static void main(String[] args) {
        char nam='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(nam);
                nam++;
            }
            System.out.println("");
        }

    }
    
}
