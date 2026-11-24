import java.util.Scanner;
public class Forth {
    public static void M(double[][] a) {
        int n = a.length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (left <= right && top <= bottom) {
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][left] + " ");
            }
            left++;

            for (int j = left; j <= right; j++) {
                System.out.print(a[bottom][j] + " ");
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][right] + " ");
                }
                right--;
            }

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(a[top][j] + " ");
                }
                top++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы N: ");
        int n = scanner.nextInt();

        if (n <= 0 || n % 2 == 0) {
            System.out.println("Ошибка: N должно быть положительным нечётным числом.");
            return;
        }

        double[][] a = new double[n][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Элементы по спирали:");
        M(a);
    }
}
