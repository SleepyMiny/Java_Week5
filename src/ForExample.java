public class ForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = "+i);
            for (int j = 0; j < i; j++) {
                System.out.println("j = "+j);
            }
        }
    }
}