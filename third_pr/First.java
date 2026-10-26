import java.util.Scanner;

public class First {
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

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            for (int i = 0; i < 2 && left <= right; i++) {
                System.out.print(a[left] + " ");
                left++;
            }

            for (int i = 0; i < 2 && left <= right; i++) {
                System.out.print(a[right] + " ");
                right--;
            }
        }
    }
}
