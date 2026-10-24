import java.util.Scanner;

public class First {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Ошибка: A должно быть меньше B");
            return;
        }

        int count = 0;

        for (int i = b; i >= a; i--) {
            System.out.println(i);
            count++;
        }

        System.out.println("Количество чисел: " + count);


    }
}
