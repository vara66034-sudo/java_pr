import java.util.Scanner;

public class Third {
    static double[] calculate(double[] a) {
        int n = a.length;
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + a[j];
            }
            b[i] = sum / (n - i);
        }
        return  b;
    }

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

        double[] b = calculate(a);
        System.out.println("Массив B:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
