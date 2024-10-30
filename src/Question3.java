import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
        } while (n <= 1);
        System.out.println("The number is: " + n);
    }
}
