import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자: ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자: ");
        int b = sc.nextInt();

        int n = 0;
        do {
            n = a % b;
            a = b;
            b = n;
        } while (b != 0);
        System.out.println(a);
    }
}
