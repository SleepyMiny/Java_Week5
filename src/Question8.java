import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 100){
            if (a % 2 != 0){
                sum += a;
            }
            a++;
        }
        System.out.println(sum);
    }
}
