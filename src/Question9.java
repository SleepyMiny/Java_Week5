import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        do {
            System.out.print("Enter your age: ");
            age = sc.nextInt();
        } while (age < 0);

        System.out.println("You are " + age + " years old.");
    }
}
