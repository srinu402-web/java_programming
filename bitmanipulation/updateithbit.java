package bitmanipulation;

public class updateithbit {

    static int update(int n, int i, int newBit) {

        if (newBit == 0) {
            return n & ~(1 << i);   // Clear bit
        } else {
            return n | (1 << i);    // Set bit
        }
    }

    public static void main(String[] args) {

        System.out.println(update(10, 2, 1)); // 14
        System.out.println(update(10, 1, 0)); // 8
    }
}