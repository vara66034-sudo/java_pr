import java.util.Scanner;

public class Fifth {
    static Scanner scanner = new Scanner(System.in);

    static void main() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("\nГлавное меню:");
            System.out.println("1. Вычислить площадь треугольника");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("0. Выход");

            System.out.print("Выберите пункт: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Ошибка: введите номер пункта.");
                scanner.next();
                continue;
            }

            if (choice == 1) {
                calculate();
            } else if (choice == 2) {
                info();
            } else if (choice == 3) {
                developer();
            } else if (choice == 0) {
                System.out.println("Программа завершена.");
            } else {
                System.out.println("Ошибка: такого пункта нет.");
            }
        }

        scanner.close();
    }

    static void calculate() {
        System.out.println("Расчет площади по формуле Герона.");

        double a;
        double b;
        double c;

        while (true) {
            System.out.print("Введите сторону a: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: введите число.");
                scanner.next();
                continue;
            }
            a = scanner.nextDouble();

            System.out.print("Введите сторону b: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: введите число.");
                scanner.next();
                continue;
            }
            b = scanner.nextDouble();

            System.out.print("Введите сторону c: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: введите число.");
                scanner.next();
                continue;
            }
            c = scanner.nextDouble();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Ошибка: стороны должны быть больше нуля.");
                continue;
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Ошибка: такого треугольника не существует.");
                continue;
            }

            break;
        }

        double area = heron(a, b, c);
        System.out.println("Площадь треугольника: " + area);
    }

    static double heron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    static void info() {
        System.out.println("Программа вычисляет площадь треугольника");
        System.out.println("по трем сторонам с помощью формулы Герона.");
    }

    static void developer() {
        System.out.println("Разработчик: Андреева Варвара");
    }
}
