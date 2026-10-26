import java.util.Scanner;

public class Second {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0");
            return;
        }

        double[] a = new double[n];
        System.out.println("Введите элементы массива через пробел:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                if (i == 1 || a[i - 1] <= a[i - 2]) {
                    count++;
                }
            }
        }

        System.out.println("Количество возрастающих участков: " + count);
    }
}
