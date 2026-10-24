import java.util.Scanner;

public class Second {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0");
            return;
        }

        double sum_a = 0;
        double power = 1;

        for (int i = 1; i <= n; i++) {
            power = power * a;
            sum_a = sum_a + power;
        }

        System.out.println("Сумма: " + sum_a);
    }
}
