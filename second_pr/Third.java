import java.util.Scanner;

public class Third {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double e = scanner.nextDouble();

        if (e <= 0) {
            System.out.println("Ошибка: E должно быть больше 0");
            return;
        }

        double a1 = 1;
        double a2 = 2;
        int k = 2;
        double a3 = (a1 + 2 * a2) / 3;

        while (Math.abs(a3 - a2) >= e) {
            a1 = a2;
            a2 = a3;
            a3 = (a1 + 2 * a2) / 3;
            k ++;
        }

        System.out.println("K = " + (k + 1));
        System.out.println("A(K-1) = " + a2);
        System.out.println("A(K) = " + a3);
    }
}
